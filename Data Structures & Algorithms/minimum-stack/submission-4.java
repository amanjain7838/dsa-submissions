class MinStack {
     Stack<Integer> stack;
     Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
        return;
    }
    
    public void pop() {
        if(stack.isEmpty()) return;

        int top = stack.pop();
        if(!minStack.isEmpty() && top==minStack.peek()){
            minStack.pop();
        }
        return;
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        if(minStack.isEmpty())
            return 0;
        return minStack.peek();
    }
}