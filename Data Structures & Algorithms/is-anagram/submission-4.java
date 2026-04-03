
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> freq1 = new HashMap<>();
        Map<Character,Integer> freq2 = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            Integer freq = freq1.get(s.charAt(i));
            
            if(freq!=null){
                freq1.put(s.charAt(i), ++freq);
            }
            else{
                freq1.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i<t.length(); i++){
            Integer freq = freq2.get(t.charAt(i));
            if(freq!=null){
                freq2.put(t.charAt(i), ++freq);
            }
            else{
                freq2.put(t.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer> entry: freq1.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue(); 
            if(freq2.get(key)!=null && Integer.parseInt(freq2.get(key).toString())==value){
                freq2.put(key,0);
            }else{
                // System.out.println(key+" "+value+" "+freq2.get(key));
                return false;
            }
        }
        for(Map.Entry<Character,Integer> entry: freq2.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue(); 
            if(value>0){
                // System.out.println(key);
               return false; 
            }
        }
        
        return true;
    }
}
