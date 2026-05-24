class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        traverse(nums, 0, answer, temp);
        return answer;
    }
    
    public static void traverse(int[] nums, int index,List<List<Integer>> answer, List<Integer> temp){
        if(index>=nums.length)
        {
            answer.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        traverse(nums, index+1, answer, temp);
        temp.remove(temp.size()-1);
        traverse(nums, index+1, answer, temp);

    }
}
