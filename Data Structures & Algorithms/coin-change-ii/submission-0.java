class Solution {
 public int change(int amount, int[] coins) {
        Arrays.sort(coins);

        int[][] dp = new int[coins.length][amount+1];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return dfs(0, amount, coins, dp);
    }

    public int dfs(int i, int amount, int[] coins, int[][] dp){

        if(amount==0)
            return 1;
        
        if(i>=coins.length)
            return 0;
        
        int res = 0;
        if(dp[i][amount]!=-1)
            return dp[i][amount];
            
        if(coins[i]<=amount){
            res = dfs(i+1, amount, coins, dp);
            res+=dfs(i, amount-coins[i], coins, dp);

        }
        dp[i][amount]=res;
        return res;


    }
}
