class Solution {
 public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];

        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        return dfs(prices, 0, 0, prices.length, dp);
    }

    public static int dfs(int[] prices, int i, int buy, int n, int[][] dp){
        int profit = 0;
        
        if(i>=prices.length){
            return profit;
        }
                if (dp[i][buy] != -1) {
            return dp[i][buy];
        }
        if(buy==0){
            profit=Math.max(0+dfs(prices, i+1, 0, n, dp), -prices[i]+dfs(prices, i+1, 1, n, dp));
        }

        if(buy == 1){
            profit = Math.max(0+dfs(prices, i+1, 1, n, dp), prices[i]+dfs(prices, i+2, 0, n, dp));
        }

        dp[i][buy]=profit;

        return profit;

    }
}
