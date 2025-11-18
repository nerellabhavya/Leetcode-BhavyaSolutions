class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int count=0;
        int arr[]=new int[n];
        int small[]=new int [102];
        for(int i=0;i<n;i++){
            int x=nums[i];
            small[x+1]++;      
         }
         for(int i=1;i<102;i++){
            small[i]=small[i]+small[i-1];
         }
         for(int i=0;i<n;i++){
            int x=nums[i];
            arr[i]=small[x];
         }
         return arr;
    }
}