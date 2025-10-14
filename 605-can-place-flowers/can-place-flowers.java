class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     int n1=flowerbed.length;
     for(int i=0;i<n1;i++){
        if(flowerbed[i]==0){
            boolean left=(i==0||flowerbed[i-1]==0);
            boolean right=(i==flowerbed.length-1||flowerbed[i+1]==0);
            if(left&&right==true){
                flowerbed[i]=1;
                n--;
            }
        }
        if(n<=0)return true;
     }
     return false;
    }
}