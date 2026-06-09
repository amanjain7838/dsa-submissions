class Solution {
public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        traverse(nums, 0, answer, temp);
        return answer;
        
    }    

    public static void traverse(int[] nums, int index,List<List<Integer>> answer, List<Integer> temp){

        answer.add(new ArrayList<>(temp));

        for(int i = index; i<nums.length; i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            traverse(nums, i+1, answer, temp);
            temp.remove(temp.size()-1);
        }
    }
}
