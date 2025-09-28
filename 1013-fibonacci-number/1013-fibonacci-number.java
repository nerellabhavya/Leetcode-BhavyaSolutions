class Solution {
    public int fib(int n) {
        int c=0;
        if(n==0)return 0;
        if(n==1)return 1;
        int a=0;
        int b=1;
        while(n>1){
           c=a+b;
          a=b;
          b=c;
          n--;
        }
        return c;
    }
}