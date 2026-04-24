class Solution {
    public int search(int[] nums, int target) {

        int answer = -1;
        int left = 0;
        int right = nums.length;
        int mid = (left+right)/2;

        while(left<right){
            mid = left + (right - left) / 2;
            System.out.println(left+" "+right+" "+mid);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                break;
            }
        }
        return answer;
    }
}
