package dsaPractice;

public class BestTimeToBuyAndSellStock {
  /*
   * In this problem, I used an optimized single-pass approach.
   * First, I tracked the minimum stock price seen so far because we always want
   * to buy at the lowest possible price.
   * Then while iterating through the array, for every current price, I calculated
   * the potential profit by subtracting the minimum price from the current price.
   * After that, I updated the maximum profit whenever a higher profit was found.
   * This way, I solved the problem in O(n) time complexity using only O(1) extra
   * space.
   */
  public static void main(String[] args) {

    int[] prices = { 7, 1, 5, 3, 6, 4 };
    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (minPrice > prices[i]) {
        minPrice = prices[i];
      }
      int currentProfit = prices[i] - minPrice;
      maxProfit = Math.max(maxProfit, currentProfit);
    }
    System.out.println(maxProfit);

  }
  /*
   * Why not brute force?
   * 
   * Brute force would compare every buy-sell pair, resulting in O(n²) complexity.
   * Instead, I maintained the minimum price dynamically while traversing once,
   * reducing complexity to O(n).
   */

}
