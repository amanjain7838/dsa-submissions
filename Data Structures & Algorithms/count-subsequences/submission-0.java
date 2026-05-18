class Solution {
  public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] row: dp)
            Arrays.fill(row, -1);

        return dfs(s,t,0, 0,dp);
    }

    public int dfs(String s,String t,int i,int j, int[][] dp){
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            int take = dfs(s, t, i+1, j+1, dp);
            int notTake = dfs(s, t, i+1, j, dp);
            dp[i][j]=take+notTake;
        }
        else{
            dp[i][j]=dfs(s, t, i+1, j, dp);
        }

        return dp[i][j];
    }
}
