class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int n=tokens.length;
        int res=0;
        for(int i=0;i<n;i++){
            String t=tokens[i];
            if(n==1){
                res=st.push(Integer.parseInt(t));
            }
            if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
                int b=st.pop();
                int a=st.pop();
                
                if(t.equals("+"))res=a+b;
                else if(t.equals("-"))res=a-b;
                else if(t.equals("*"))res=a*b;
                else res=a/b;
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(t));
            }
        }
        return res;
    }
}