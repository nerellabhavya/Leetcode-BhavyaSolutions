class Solution {
    public int calPoints(String[] ops) {
        int n=ops.length;
       Stack<Integer>s=new Stack<>();
       int sum=0;
       for(int i=0;i<n;i++){
        String so=ops[i];
        if(so.equals("+")){
            int t1=s.pop();
            int t=t1+s.peek();
            s.push(t1);
            s.push(t);
        }
        else if(so.equals("C")){
            int r=s.pop();
        }
        else if(so.equals("D")){
            int q=s.peek();
            int o=q*2;
            s.push(o);
        }
        else{
            s.push(Integer.parseInt(so));
        }
        }
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}