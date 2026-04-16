class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> calc = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            switch(tokens[i]) {
                case "+":
                    calc.push(calc.pop()+calc.pop());
                    break;
                case "-":
                    int fs = calc.pop();
                    int ss = calc.pop();

                    int ns = ss-fs;
                    calc.push(ns);
                    break;
                case "*":
                    calc.push(calc.pop()*calc.pop());
                    break;
                case "/":
                    int f = calc.pop();
                    int s = calc.pop();
                    int number = s/f;
                    calc.push(number);
                    break;
                default:
                    calc.push(Integer.parseInt(tokens[i]));
            }
        }
        return calc.pop();
    }
}
