class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
         int closestsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<=nums.length-3;i++){
         int left=i+1;
         int right=nums.length-1;
         while(left<right){
             sum=nums[i]+nums[left]+nums[right];
            if(Math.abs(closestsum-target)>Math.abs(sum-target)){
                closestsum=sum;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
         }
        }
        return closestsum;
    }
}