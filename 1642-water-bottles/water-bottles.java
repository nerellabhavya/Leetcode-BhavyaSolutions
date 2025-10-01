class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int b=numBottles;
        int t=numBottles;
        int e=numExchange;
        while(b>=e){
            int n=b/e;
            t+=n;
            b=(b%e)+n;
        }
        return t;
    }
}