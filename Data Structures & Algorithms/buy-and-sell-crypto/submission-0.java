class Solution {
public int maxProfit(int[] prices) {

        int left = 0;
        int right = left+1;
        int profit = 0;

        while(left<(prices.length) && right<(prices.length) ){
            profit = Math.max(profit, prices[right]-prices[left]);
            System.out.println(left+" "+right);
            if(prices[left]<prices[right]){
                right++;
            }
            else{
                left++;
            }
            if(left==right){
                right++;
            }
        }
        return profit;
    }
}
