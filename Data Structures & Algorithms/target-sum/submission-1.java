class Solution {
public int totalSum=0;
    public int findTargetSumWays(int[] nums, int target) {
        totalSum = 0;
        for(int num: nums)
            totalSum+=num;
        
        
        int[][] dp = new int[nums.length][2*totalSum+1];
        
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return dfs(0, nums, target, 0, dp);
        
    }

    public int dfs(int i, int[] nums, int target, int total, int[][] dp){
        if(i==nums.length)
            return target==total?1:0;

        if(dp[i][total+totalSum]!=-1)
            return dp[i][total+totalSum];
        dp[i][total+totalSum]=dfs(i+1, nums,target, total+nums[i], dp)+dfs(i+1, nums,target, total-nums[i], dp);

        return dp[i][total+totalSum];

    }
}
