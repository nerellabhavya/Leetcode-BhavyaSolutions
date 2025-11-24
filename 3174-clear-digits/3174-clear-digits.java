class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        String r="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
       for(int i=0;i<st.size();i++){
            char ch=st.get(i);
            r=r+ch;
                }
        return r;
    }
}