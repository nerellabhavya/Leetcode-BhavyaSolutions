class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
       Arrays.sort(nums);
       for(int i=0;i<n;i++){
        if(nums[i]<0&&k>0){
            nums[i]=nums[i]*-1;
            k--;
        }
       }
       Arrays.sort(nums);
       if(k%2==1){
        nums[0]=-nums[0];
       }
       for(int i=0;i<n;i++){
        sum+=nums[i];
       }
       return sum;
    }
}

/*we need to sort the array 2 times because for example by firat sorting the array becomes[-3,0,1,2] and k=3
after changing the sign of the -3 it is the largest number of the array and we sort the array as[0,1,2,3]
why do we need to check k%2==1 because if we flip the number 2 times it becames same 
by hving remainder one we need to change the sign*/