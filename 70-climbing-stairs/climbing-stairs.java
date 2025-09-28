class Solution {
    public int climbStairs(int n) {
        int p=1;
        int s=2;
        int a=1;
       int b=2;
       int result=0;
       if(n==1){
        return p;
       }
       else if(n==2){
        return s;
       }
       
       else{
        
        while(n>2){
       int c=a+b;
       a=b;
       b=c;
       n--;}
         
       }
       return b;
    }
}