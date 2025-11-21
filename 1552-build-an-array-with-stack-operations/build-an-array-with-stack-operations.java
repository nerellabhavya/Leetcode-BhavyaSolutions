class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String>list=new ArrayList<>();
        int s=target.length;
        int j=0;
        for(int i=1;i<=n;i++){
              if(j==s)break;
            if(i==target[j]){
                list.add("Push");
                j++;
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}