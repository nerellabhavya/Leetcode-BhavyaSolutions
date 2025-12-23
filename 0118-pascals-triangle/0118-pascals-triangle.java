class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>tri=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer>list=new ArrayList<>();
            int val=1;
            for(int j=0;j<=i;j++){
                list.add(val);
                val=val*(i-j)/(j+1);
            }
            tri.add(list);
        }
        return tri;
    }
}