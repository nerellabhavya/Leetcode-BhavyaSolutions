class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int ans=0;
        int n=heights.length;
        int w=0;
        int cur=0;
        for(int i=0;i<=n;i++){
            cur=(i==n)?0:heights[i];
            while(!st.isEmpty()&&cur<heights[st.peek()]){
                  int h=heights[st.pop()];
                  if(st.isEmpty()){
                     w=i;
                  }
                  else{
                    w=i-st.peek()-1;
                  }
                  int area=h*w;
                   ans=Math.max(area,ans);
            }
            st.push(i);
        }
        return ans;
    }
}