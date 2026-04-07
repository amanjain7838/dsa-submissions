class Solution {
    public int trap(int[] heights) {
        int left = 0;
        int right = heights.length-1;

        int leftMax = heights[0]; int rightMax = heights[right];
        int trappedWater = 0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax, heights[left]);
                trappedWater+=leftMax-heights[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax, heights[right]);
                trappedWater+=rightMax-heights[right];
            }
        }
        return trappedWater;
    }
}
