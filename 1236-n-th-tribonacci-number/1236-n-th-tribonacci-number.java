class Solution {
    public int tribonacci(int n) {
      int a=0;
      int b=1;
      int c=1;
      int d=3;
      int sum=0;
      if(n==0)return 0;
      if (n==1||n==2)return 1;
      while(n>=d){
        sum=a+b+c;
        a=b;
        b=c;
        c=sum;
        d++;
      }
      return sum;  
    }
}