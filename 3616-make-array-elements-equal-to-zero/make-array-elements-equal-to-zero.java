class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               if(simulate(nums,i,-1))count++;
               if(simulate(nums,i,1))count++;
            }
        }
        return count;
    }
        private boolean simulate(int []nums,int start,int dir){
            int arr[]=nums.clone();
            int curr=start;
            while(curr>=0&&curr<arr.length){
                if(arr[curr]==0){
                    curr+=dir;
                }
                else{
                    arr[curr]--;
                    dir*=-1;
                    curr+=dir;
                }
            }
            for(int val=0;val<arr.length;val++){
                if(arr[val]!=0){
                    return false;
                }
            }
            return true;
        }
    
}