class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      int n=nums.length;
      int sum=0;
      for(int i=0;i<n;i++){
          int x=Math.abs(nums[i]);
          int pos=x-1;
          if(nums[pos]>0){
          nums[pos]=-nums[pos];}
      }
      ArrayList<Integer>list=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(nums[i]>0){
            list.add(i+1);
        }
      } 
      return list;
    }
}