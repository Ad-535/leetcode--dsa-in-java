class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
       // int profit = 0;
        int max = 0;
        for(int i=0;i<prices.length-1;i++){
            if(min>prices[i]){
                min = prices[i];
            }
                int profit = prices[i+1]-min;
                max = Math.max(max,profit);
        }
        return max;
    }
}