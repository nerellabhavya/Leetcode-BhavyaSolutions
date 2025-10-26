class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        boolean ans=true;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                
                left++;
                right--;
            }
            else{
                ans= check(s,left,right-1)||check(s,left+1,right);
                break;
            }
            
        }
        return ans;
    }

          static boolean check(String s,int l,int r) {
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                
                return false;
            }
            l++;
                r--;
                
        }
              return true;
    }
}