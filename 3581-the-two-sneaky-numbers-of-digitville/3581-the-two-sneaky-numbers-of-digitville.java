class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      int result[]=new int[2];
      int idx=0;
      HashSet<Integer>seen=new HashSet<>();
      for(int i=0;i<nums.length;i++){
          int x=nums[i];
          if(seen.contains(x)){
             result[idx]=x;
             idx++;
          }
          if(idx==2)
          break;
          else{
               seen.add(x);
          }
      }
      return result;
    }
}