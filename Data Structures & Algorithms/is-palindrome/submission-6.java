class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;
        s=s.toLowerCase();
        boolean matchedOneTime = false;
        int sLen = s.length();
        while(left<right){
            int charAtLeft = (int)(s.charAt(left));
            int charAtRight = (int)s.charAt(right);
                System.out.println(charAtLeft+" " +charAtRight);

            if(!((charAtLeft>=97 && charAtLeft<=122)|| (charAtLeft>=48 && charAtLeft<=57))) {
                left++;
                sLen--;
            }
            else if(!((charAtRight>=97 && charAtRight<=122)|| (charAtRight>=48 && charAtRight<=57))) {
                right--;
                sLen--;
            }
            else {
                System.out.println(s.charAt(left)+" " +s.charAt(right));
                if(charAtLeft!=charAtRight){
                    return false;
                }
                matchedOneTime = true;
                right--;
                left++;
            }
        }
        if(matchedOneTime||sLen<2){
            return true;
        }
        else 
            return false;

    }

}
