package DAY24;

public class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {

    int[] prices = { 7, 1, 5, 3, 6, 4 };
    int minBuy = prices[0];
    int maxProfit = 0;

    for (int price : prices) {
      if (minBuy > price) {
        minBuy = price;
      }
      int profit = price - minBuy; // Profit will buy price minus sell price
      maxProfit = Math.max(maxProfit, profit);
    }
    System.out.println(maxProfit);
  }
}
