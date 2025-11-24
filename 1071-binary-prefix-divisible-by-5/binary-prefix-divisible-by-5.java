class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean>l=new ArrayList<>();
        int d=0;
        for(int i=0;i<nums.length;i++){
            d=((d*2)+nums[i])%5;
        
               l.add(d==0);
            
        }
        return l;
    }
}