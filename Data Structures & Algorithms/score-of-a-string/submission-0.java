class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0; i<s.length(); i++) {
            int nextpos = i+1;
            if(nextpos<s.length()) {
                score+=Math.abs((int) s.charAt(nextpos) - (int) s.charAt(i));
            }
        }
        return score;
    }
}