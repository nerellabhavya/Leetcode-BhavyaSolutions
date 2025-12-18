class Solution {
    public double myPow(double x, int n) {
      
      double res=1.0;
      long M=n;
        if(M<0){
            M=-M;
            x=1/x;
        }
         while(M>0){
            if(M%2==1){
                res*=x;
            }
            x*=x;
            M/=2;
         }
        return res;
    }
}