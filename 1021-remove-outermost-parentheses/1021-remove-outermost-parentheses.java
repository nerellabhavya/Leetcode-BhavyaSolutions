class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        
        for(int i = 0; i < s.length(); i++){
    char c = s.charAt(i);
            if (c == '(') {
                if (depth > 0) sb.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0) sb.append(c); 
            }
        }
        
        return sb.toString();
    }
}


/*class Solution {
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
}*/