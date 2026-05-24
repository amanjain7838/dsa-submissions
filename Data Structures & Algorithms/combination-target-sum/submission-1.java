class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        traverse(nums, answer, temp, target, 0);
        return answer;
    }
    
    public static void traverse(int[] nums, List<List<Integer>> answer, List<Integer> temp, int target, int start){
        
        if(target==0){
            answer.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)
            return;
        
        for(int i = start; i<nums.length; i++){
            temp.add(nums[i]);
            traverse(nums, answer, temp, target-nums[i], i);
            temp.remove(temp.size()-1);

        }

    }
}
