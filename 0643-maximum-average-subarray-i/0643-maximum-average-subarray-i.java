class Solution {
    public double findMaxAverage(int[] nums, int k) {
      
        Double maximum=0.0;
        double cal=0.0;
        int n=nums.length;
  
        for(int i=0;i<k;i++){
             cal=cal+nums[i];
            }
            double s1=cal;
            maximum=cal;
           for (int i=k;i<n;i++){
             s1=nums[i]-nums[i-k]+s1;
         maximum=Math.max(maximum,s1);}
          
         return maximum/k;
    }
}