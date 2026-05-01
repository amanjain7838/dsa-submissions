class Solution {
public int coinChange(int[] coins, int amount) {
        
        Map<Integer, Integer> dp = new HashMap<>();
        int answer = dfs(coins, amount, dp);
        return answer!=Integer.MAX_VALUE?answer:-1;
    }

    public int dfs(int[] coins, int amount, Map<Integer, Integer> dp){

        if(amount == 0)
            return 0;
        if(dp.containsKey(amount))
            return dp.get(amount);

        int res = Integer.MAX_VALUE;

        for(int coin: coins){
            if(amount - coin >= 0){
                int result = dfs(coins, amount-coin, dp);
                if(result!=Integer.MAX_VALUE){
                    res=Math.min(res, 1+result);
                }
            }
        }
        dp.put(amount, res);
        return res;
    }
}
