class Solution {
    public String removeOuterParentheses(String s) {
        String r="";
        int oc=0;
        int cc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(oc>0){
                    
                    r=r+ch;
                }
                oc++;
            }
            if(ch==')'){
                oc--;
                if(oc>0){
                    r=r+ch;
                }
            }
        }
        return r;
    }
}