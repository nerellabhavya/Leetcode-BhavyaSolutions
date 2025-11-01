class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
       
        for(int i=0;i<arr.length;i++){
             int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }}
            ArrayList<Integer>list=new ArrayList<>(map.keySet());
int limit=arr.length/4;
            for(int i=0;i<list.size();i++){
                int key=list.get(i);
                 if(map.get(key)>limit){
                    return key;
                 }
            }
        
        return 1;
    }
}