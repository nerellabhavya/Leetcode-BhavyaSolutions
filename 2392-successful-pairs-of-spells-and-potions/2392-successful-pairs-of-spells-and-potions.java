import java.util.*;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m=spells.length;
        int n=potions.length;
        int []result=new int[m];
        for(int i=0;i<m;i++){
            int spell=spells[i];
            long required=((success+spell-1)/spell);
            int low=0;
            int high=n-1;
            int index=n;
            while(low<=high){
            int mid=(low+high)/2;
            if(potions[mid]>=required){
                index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            }
            result[i]=n-index;
        }
        return result;
    }
}