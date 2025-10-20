class Solution {
    public int minCostClimbingStairs(int[] cost) {
      int prev1=0;
      int prev2=0;
      int n=cost.length;
      for(int i=2;i<=n;i++){
        int minimum=Math.min(prev1+cost[i-1],prev2+cost[i-2]);
        prev2=prev1;
        prev1=minimum;
      }
      return prev1;
    }
}