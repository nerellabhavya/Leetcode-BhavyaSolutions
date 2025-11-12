class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int n=nums.length;
     int count=0;
     int s=0;
     for(int i=0;i<n;i++){
        if(nums[i]==1){
            count++;
            if(count>s)s=count;
        }
        else{
            count=0;
        }
     } 
     return s;  
    }
}