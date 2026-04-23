class Solution {
    private int[][] memo;
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        memo = new int[nums.length][2];
        for(int i = 0; i<nums.length;i++){
            memo[i][0]=-1;
            memo[i][1]=-1;
        }

        return Math.max(dfs(0, 1, nums), dfs(1,0,nums));
    }

    private int dfs(int index, int flag, int[] nums){
        if(index>=nums.length || flag==1 && index==nums.length-1)
            return 0;
        if(memo[index][flag]!=-1)
            return memo[index][flag];

        memo[index][flag]=Math.max(dfs(index+1, flag, nums), nums[index]+dfs(index+2, flag|(index==0 ?1:0),nums));

        return memo[index][flag];
    }
}
