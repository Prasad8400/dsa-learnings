package DAY44;

import java.util.Arrays;

public class FinalPricesWithSpecialDiscount1475 {
    public static void main(String[] args) {
        int[] prices = { 8, 4, 6, 2, 3 };

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(prices));
    }

}