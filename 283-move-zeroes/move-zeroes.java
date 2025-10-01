class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=nums.length;
       for(int i=0;i<right;i++){
        if(nums[i]!=0){
            nums[left]=nums[i];
            left++;
        }}
        for(int i=left;i<right;i++){
            nums[i]=0;
        }
    }
}