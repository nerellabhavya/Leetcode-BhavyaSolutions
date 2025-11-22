class Solution {
    public int minOperations(String[] logs) {
        Stack<String>s=new Stack<>();
        int sum=0;
        int n=logs.length;
        for(int i=0;i<n;i++){
            String so=logs[i];
            if(so.equals("../")){
               if(sum>0){
               sum--;}
            }
           else if(so.equals("./")){
                
            }
           else{
               sum++;
            }
        }
        
        return sum;
    }
}