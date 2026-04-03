class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        StringBuilder sb = new StringBuilder(t);
        for(int i = 0; i<s.length(); i++) {
            for(int j = 0; j<sb.length(); j++) {
                if(s.charAt(i)==sb.charAt(j)){
                    sb.setCharAt(j, '_');
                    break;
                }
            }
        }
        for(int j = 0; j<t.length(); j++) {
            if(sb.charAt(j)!='_'){
                return false;
            }
        }
        return true;
    }
}
