package Array;

import java.util.*;

public class Buy_And_Sell_Stocks {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            if (buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++)
        {
            prices[i] = sc.nextInt();
        }
        System.out.println("Maxximum Profit earned is: "+buyAndSellStocks(prices));
    }
}