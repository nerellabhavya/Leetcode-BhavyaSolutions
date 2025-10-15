class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int maxfar=nums[0];
        int minfar=nums[n-1];
        int left=n-1;
        int right=0;
        for(int i=0;i<n;i++){
            if(nums[i]<maxfar){
               right=i;
            }
            else{
                maxfar=nums[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>minfar){
               left=i;
            }
            else{
                minfar=nums[i];
            }
        }
        if(right<=left)return 0;
        return right-left+1;
    }
}