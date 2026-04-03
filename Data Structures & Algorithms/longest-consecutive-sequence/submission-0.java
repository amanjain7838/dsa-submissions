class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num: nums){
            if(!set.contains(num-1)){
               int length = 1;
               while(set.contains(num+length)){
                    length++;
               }
               maxLength=Math.max(length, maxLength);
            }
        }

        return maxLength;

    }
}
