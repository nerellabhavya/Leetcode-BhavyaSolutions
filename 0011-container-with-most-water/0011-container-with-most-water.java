class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int width;
        int maxa=0;
int curr=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            width=right-left;
            
             maxa=Math.max(h*width,maxa);
             if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return maxa;
    }
}