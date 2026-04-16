
/*
 * link - https://www.geeksforgeeks.org/problems/buy-stock-2/1
 * Difficulty : Easy

  Given an array prices[] of non-negative integers, representing the prices of the stocks on different days. The task 
  is to find the maximum profit possible by buying and selling the stocks on different days when at most one 
  transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then 
  return 0.

Note: Stock must be bought before being sold.

  Constraints: 
   1 ≤  prices.size() ≤  105
   0 ≤  prices[i] ≤  104
  
  Examples:
    1.
    Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
    Output: 8
    Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.

    2.
    Input: prices[] = [7, 6, 4, 3, 1]
    Output: 0 
    Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater 
    price. Hence, the answer is 0.

    3.
    Input: prices[] = [1, 3, 6, 9, 11]
    Output: 10 
    Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and 
    selling at price[n-1].

 */



public class StockBuyAndSell4 {
    public int maxProfit(int[] prices) {
      int n = prices.length;
      int minPrice = Integer.MAX_VALUE;
      int maxprofit = 0;
      for (int i = 0; i < n; i++) {
        if (prices[i] < minPrice)
          minPrice = prices[i];
        else {
          int currentProfit = prices[i] - minPrice;
          if (currentProfit > maxprofit)
            maxprofit = currentProfit;
        }

      }
      return maxprofit;

      // int i=0, j=i+1;
      // while(i<prices.length-1 && j<prices.length && prices[j]>prices[i]){
      // int gap = prices[j]-prices[i];
      // if(gap>max) max=gap;

      // }

      // O(n^2)
      // int max=Integer.MIN_VALUE;
      // for(int i=0; i<n-1; i++){
      // for(int j=i+1; j<n; j++){
      // int gap = prices[j]-prices[i];
      // if(gap>max) max=gap;
      // }
      // }
      // if(max>0) return max;
      // else return 0;
    }
}
