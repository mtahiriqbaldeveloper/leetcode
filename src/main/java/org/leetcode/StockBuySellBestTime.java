package org.leetcode;

public class StockBuySellBestTime {

    public static void main(String ... args){

        int[] prices = {1,2,1,2,1,3,5,1};
        int profit = prices[0];
        int currentProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if(prices[i] < profit){
                profit = prices[i];
            }
            currentProfit = prices[i]- profit;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
        }

        System.out.println(maxProfit);
    }
}
