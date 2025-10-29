class Solution {
    public int smallestNumber(int n) {
        int bitlen=32-Integer.numberOfLeadingZeros(n);
        int ans=(1<<bitlen)-1;
        if(ans<n){
            ans=(1<<(bitlen)+1)-1;
        }
        return ans;
    }
}