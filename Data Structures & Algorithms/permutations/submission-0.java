class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        recurPermute(0, nums, answer);
        return answer;
    }

    public static void recurPermute(int index, int[] nums, List<List<Integer>> answer){

        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            answer.add(ds);
            return;
        }

        for(int i = index; i<nums.length;i++){
            swap(i, index, nums);
            recurPermute(index+1, nums, answer);
            swap(i, index, nums);
        }
    }
        public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
