class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            int curr=nums2[i];
            while(!stack.isEmpty()&&curr>=stack.peek()){
            map.put(stack.pop(),curr);
        }
        stack.push(curr);
        }
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}