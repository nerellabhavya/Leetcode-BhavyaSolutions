class Solution {
    public int totalMoney(int n) {
     int total=0;
     int current=1;
     int week=0;
     for(int i=0;i<n;i++){
        total=total+current;
        current++;
        week++;
        if(week==7){
            week=0;
            current=current-7+1;
        }
     }
     return total;
    }
}