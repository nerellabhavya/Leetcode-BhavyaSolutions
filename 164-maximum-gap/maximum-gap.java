class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        int ans=0;
        int res=0;
        if(n==0||n==1)return 0;
        else {
            Arrays.sort(nums);
            for(int i=0;i<n-1;i++){
                res=Math.max(res,Math.abs(nums[i]-nums[i+1]));
                if(res<1){
                ans= 0;
                }
                else{
                    ans=res;
                }
               
            }
        }
        return ans;
    }
}