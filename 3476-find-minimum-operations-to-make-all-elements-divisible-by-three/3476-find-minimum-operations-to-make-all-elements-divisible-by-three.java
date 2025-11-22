class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(x%3!=0){
                x=x+1;
                if(x%3==0){
                    count++;
                }
                else{
                    x=x-2;
                    if(x%3==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}