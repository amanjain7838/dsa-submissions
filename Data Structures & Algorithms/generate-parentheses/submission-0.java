class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<String>();
        String temp = "";
        traverse(n, n, answer, temp);
        return answer;
        
    }

    public static void traverse(int open,int close, List<String> answer,  String parenthesis){

        if(open==0 && close==0){
            answer.add(parenthesis);
            return;
        }

        if(open>0){
            traverse(open-1, close, answer, parenthesis+"(");
        }
        if(close>open){
            traverse(open, close-1,answer, parenthesis+")");
        }

    }
}
