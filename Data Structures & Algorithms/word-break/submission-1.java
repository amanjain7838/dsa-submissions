class Solution {
//  public boolean wordBreak(String s, List<String> wordDict) {
//         Set<String> wordSet = new HashSet<>(wordDict);
//         boolean[] dp = new boolean[s.length() + 1];
//         dp[0] = true; // Base case: empty string can be segmented

//         for (int i = 1; i <= s.length(); i++) {
//             for (int j = 0; j < i; j++) {
//                 if (dp[j] && wordSet.contains(s.substring(j, i))) {
//                     dp[i] = true;
//                     break; // No need to check further if we found a valid segmentation
//                 }
//             }
//         }
//         return dp[s.length()];
//     }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;

        for(int i = s.length()-1; i>=0; i--){

            for(String word: wordSet){
                if(i+word.length()<=s.length() && s.substring(i, i+word.length()).equals(word)){
                    dp[i]=dp[i+word.length()];
                }
                if(dp[i])
                    break;
            }
        }

        return dp[0];
    }
}
