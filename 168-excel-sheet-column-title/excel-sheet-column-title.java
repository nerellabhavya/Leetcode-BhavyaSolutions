class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        int n=columnNumber;
       while(n>0){
        n--;
        int remainder=n%26;
        char letter=(char)('A'+remainder);
        result.append(letter);
        n=n/26;
       }
           return result.reverse().toString();
    }
}