class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=findfirst(nums,target);
        int last=findlast(nums,target);
        return new int[]{first,last};
      
    }
       private int findfirst(int []nums,int target){
            int n=nums.length;
            int low=0;
       int high=n-1;
int first=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            first=mid;
            high=mid-1;
            
        }
        else if(target<nums[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return first;
       }
      
     private int findlast(int []nums,int target){
         int n=nums.length;
            int low=0;
       int high=n-1;
       int last=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            last=mid;
            low=mid+1;
            
        }
        else if(target<nums[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return last;
       }
    
}