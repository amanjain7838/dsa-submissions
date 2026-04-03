class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder answer = new StringBuilder("");
        Arrays.sort(strs);
        int n = strs[0].length();
    
        for(int i = 0; i<n; i++){
            if(i>strs[0].length()-1 || i>strs[strs.length-1].length()-1 || strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}