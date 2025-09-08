class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String>cw=new HashMap<>();
        HashMap<String,Character>wc=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];
            if(cw.containsKey(c)){
                 if(!cw.get(c).equals(word)){
                    return false;
                 }}
                 else{
                    cw.put(c,word);
                 }
            
            if(wc.containsKey(word)){
                if(!wc.get(word).equals(c)){
                    return false;
                }}
                else{
                    wc.put(word,c);
                }
            }
        
        return true;
    }
}