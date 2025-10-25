class Solution {
    public int totalMoney(int n) {
        int total=0;
       int weeks=n/7;
       int days=n%7;
       total = (weeks * 28) + (7 * (weeks * (weeks - 1) / 2)) + 
        (days * (weeks + 1)) + (days * (days - 1) / 2);

        return total;
    }
}