class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];

        for(int i = 0; i<position.length; i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair, (a,b)->Integer.compare(b[0],a[0]));

        Stack<Double> stack = new Stack<>();

        for(int[] p: pair){
            double time = (double)(target-p[0])/p[1];

            if(stack.isEmpty()||time>stack.peek()){
                // if(!stack.isEmpty())
                //     stack.pop();
                stack.push(time);
            }
            // System.out.println(p[0]+" "+p[1]+" "+time+" "+stack);
            // stack.push((double) (target - p[0]) / p[1]);
            // if (stack.size() >= 2 &&
            //     stack.peek() <= stack.get(stack.size() - 2))
            // {
            //     stack.pop();
            // }
            // System.out.println(p[0]+" "+p[1]+" "+time+" "+stack);

        }
        return stack.size();
    }
}
