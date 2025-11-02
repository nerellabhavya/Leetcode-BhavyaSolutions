class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String result[]=new String[n];
        int sorting[]=score.clone();
        Arrays.sort(sorting);
        HashMap<Integer,Integer>rankmap=new HashMap<>();
        for(int i=0;i<n;i++){
            rankmap.put(sorting[i],n-i);
        }
        for(int i=0;i<n;i++){
        int rank=rankmap.get(score[i]);
        
        if (rank==1){
            result[i]="Gold Medal";
        }
        else if(rank==2){
            result[i]="Silver Medal";
        }
        else if(rank==3){
            result[i]="Bronze Medal";
        }
        else{
            result[i]=String.valueOf(rank);
        }
        }
        return result;
    }
}