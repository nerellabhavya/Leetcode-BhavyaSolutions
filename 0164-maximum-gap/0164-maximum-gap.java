class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        int ans=0;
        int res=0;
        if(n==0||n==1)return 0;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        if(min==max)return 0;
        int bucketsize=Math.max(1,(max-min)/n-1);
        int bucketcount=(max-min)/bucketsize+1;
        int bucketmin[]=new int[bucketcount];
        int bucketmax[]=new int[bucketcount];
        boolean used[]=new boolean [bucketcount];
        for(int i=0;i<bucketcount;i++){
            bucketmin[i]=Integer.MAX_VALUE;
            bucketmax[i]=Integer.MIN_VALUE;
            used[i]=false;
        }
        for(int i=0;i<n;i++){
            int num=nums[i];
            int idx=(num-min)/bucketsize;
            used[idx]=true;
            if(num<bucketmin[idx])bucketmin[idx]=num;
            if(num>bucketmax[idx])bucketmax[idx]=num;
        }
          int prevMax = min;
        int maxGap = 0;
        for (int i = 0; i < bucketcount; i++) {
            if (!used[i]) continue;
            int gap = bucketmin[i] - prevMax;
            if (gap > maxGap) maxGap = gap;
            prevMax = bucketmax[i];
        }

        return maxGap;
    }
}