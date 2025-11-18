class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        int i=0;
        int dup=0;
        long sum=0;
        while(i<n){
            int x=nums[i];
            if(set.contains(x)){
                dup=x;
            }
            else{
                set.add(x);
            }
            sum+=nums[i];
            i++;
        }
        long tot=n*(n+1)/2;
        int exp=(int)(tot-(sum-dup));
        return new int[]{dup,exp};
    }
}