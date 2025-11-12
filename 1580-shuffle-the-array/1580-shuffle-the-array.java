class Solution {
    public int[] shuffle(int[] nums, int n) {
        int n1=nums.length;
        int n2=2*n;
        int ans[]=new int[n2];
     for(int i=0;i<n;i++){
        
         ans[2*i]=nums[i];
        
         ans[(2*i)+1]=nums[i+n];
         
     } 
     return ans;  
    }
}