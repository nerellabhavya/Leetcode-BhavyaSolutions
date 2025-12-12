class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int t=0;
        int t1=0;
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            t=prices[i];
            t1=0;
            for(int j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    t1=prices[j];
                    break;
                }
            }
             int tot=t-t1;
                nums[i]=tot;
        }
        return nums;
    }
}