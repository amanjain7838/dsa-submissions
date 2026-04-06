class Solution {
public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            int target = nums[i];
            if(nums[i]>0)
                break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(left<right){
                int sum = nums[left]+nums[right]+target;
                // System.out.println(nums[i]+" "+nums[left]+" "+nums[right]+"="+(target+sum));
                if(sum>0){
                    right--;
                }
                else if(sum<0 ){
                    left++;
                } 
                else{
                    answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                }
            }
        }
        return answer;
    }
}
