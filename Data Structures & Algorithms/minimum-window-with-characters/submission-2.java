class Solution {
public String minWindow(String s, String t) {
    if(s.length()<t.length())
        return "";

        int minLength = s.length();
        String substring = "";
        int subStrLen = Integer.MAX_VALUE;

        HashMap<Character, Integer> sFreq = new HashMap<>();
        HashMap<Character, Integer> tFreq = new HashMap<>();
        int windowLen = 0;
        int tLen = 0;


        for(int i = 0; i<t.length(); i++){
            int value = tFreq.getOrDefault(t.charAt(i),0);
            tFreq.put(t.charAt(i), value+1);
            tLen++;
        }
        int left = 0; int right = left;
        int prevConsiderPost = -1;
        while(left<s.length()){

            char ch = s.charAt(right);
            int scharF = sFreq.getOrDefault(ch,0);
            int tcharF = tFreq.getOrDefault(ch,0);
            if(right!=prevConsiderPost){
                sFreq.put(ch,++scharF);
                prevConsiderPost = right;
                if(tcharF>=scharF){
                    windowLen++;
                }
            }
            if(windowLen==tLen){
                String newSub = s.substring(left,right+1);
                if(newSub.length()<subStrLen){
                    substring=newSub;
                    subStrLen=substring.length();
                }

            }

            if(windowLen<tLen && (right<s.length()-1)){
                right++;
            }
            else {
                char charAtLeft = s.charAt(left);
                int sCharAtLeftF = sFreq.get(charAtLeft)-1;
                sFreq.put(charAtLeft, sCharAtLeftF);
                // System.out.println("removed left "+charAtLeft+" freqn "+sCharAtLeftF+" "+tFreq.getOrDefault(charAtLeft,0));
                // System.out.println(sFreq);

                if(sCharAtLeftF<tFreq.getOrDefault(charAtLeft,0)){
                    windowLen--;
                }
                left++;

            }
        }

        return substring;
    }
}
