class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int sum=0;
        int prev=0;
        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(prev)){
                if(neededTime[i]<neededTime[prev]){
                    sum+=neededTime[i];
                }
                else{
                    sum+=neededTime[prev];
                    prev=i;
                }
            }
                else{
                    prev=i;
                }
            
        }
        return sum;
    }
}