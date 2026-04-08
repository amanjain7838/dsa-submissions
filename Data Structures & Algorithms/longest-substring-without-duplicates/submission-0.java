class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int answer =0;
        HashMap<Character, Integer> charPos = new HashMap<>();

        while(r<s.length()){

            if(charPos.get(s.charAt(r))!=null){
                l = Math.max(charPos.get(s.charAt(r))+1, l);
            }
            charPos.put(s.charAt(r), r);
            answer=Math.max(answer, r-l+1);
            r++;
        }
        return answer;
        
    }
}
