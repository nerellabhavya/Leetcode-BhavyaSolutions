class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        int prev=0;
        int target=0;
        int count=0;
       int curr=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if(sum%3!=0)return false;
        else{
            target=sum/3;
            prev=target;
            for(int i=0;i<n;i++){
                 curr=curr+arr[i];
            if(target==curr){
                count++;
                curr=0;
            }
            
            if(count==3){
                return true;
            }}
        }
        return false;
    }
}