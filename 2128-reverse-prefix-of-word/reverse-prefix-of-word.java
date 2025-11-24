class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch){
                sb.append(c);
                sb.reverse();
                break;
            }
            else{
              sb.append(c);
              count++;
            }
        }
for(int i=count+1;i<word.length();i++){
    char c=word.charAt(i);
    sb.append(c);
}

        return sb.toString();
    }
}