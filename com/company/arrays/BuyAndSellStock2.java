package com.company.arrays;

//BEST TIME TO BUY AND SELL STOCK -II WITH MAXIMUM PROFIT
public class BuyAndSellStock2 {

    public static int maxProfit(int[] stockPrices){
        int profit = 0;
        for(int i=1;i<stockPrices.length;i++){
            if(stockPrices[i] > stockPrices[i-1])
                profit += (stockPrices[i] - stockPrices[i-1]);
        }
        return profit;
    }
    public static void main(String args[]){
        int[] stockPrices = {5,2,6,1,4,7,3,6};
        System.out.println("THE MAXIMUM PROFIT AFTER BUYING AND SELLING IS "+maxProfit(stockPrices));
    }
}
