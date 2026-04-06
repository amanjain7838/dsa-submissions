class Solution {
public int maxArea(int[] heights) {
        int maxArea = 0;

        int left = 0;
        int right = heights.length-1;

        while(left<right){

            int wall = Math.min(heights[left], heights[right]);
            int areaBwWall = wall*(right-left);
            maxArea=Math.max(areaBwWall, maxArea);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
