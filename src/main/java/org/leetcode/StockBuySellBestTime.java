package org.leetcode;

public class StockBuySellBestTime {

    public static void main(String ... args){

        int[] prices = {7, 1, 5,3,6,4};
        int profit = prices[0];
        int len = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < len; i++) {

            if(prices[i] < profit){
                profit = prices[i];
            }
            if(prices[i]- profit > maxProfit){
                maxProfit = prices[i]- profit;
            }
        }

        System.out.println(maxProfit);
    }
}
