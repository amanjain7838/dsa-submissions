class Solution {
       public int[] maxSlidingWindow(int[] nums, int k) {
        int[] answer = new int[nums.length-k+1];
        int left = 0;
        int right = 0;
        Deque<Integer> q = new LinkedList<>();

        while(right<nums.length){

            while(!q.isEmpty() && nums[q.getLast()]<nums[right]){
                q.removeLast();
            }
            q.addLast(right);

            if(left>q.getFirst()){
                q.removeFirst();
            }
            if((right+1)>=k){
                answer[left]=nums[q.getFirst()];
                left++;
            }
            right++;
        }
       

        return answer;
    }
}
