package DAY37;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandiesInKids1431 {
  public static void main(String[] args) {

    int[] candies = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;
    int maxCandies = 0;
    List<Boolean> candiesList = new ArrayList<>();

    for (int candy : candies) {
      if (candy > maxCandies)
        maxCandies = candy;
    }

    for (int i = 0; i < candies.length; i++) {
      int sumOfCandies = candies[i] + extraCandies;
      if (maxCandies <= sumOfCandies)
        candiesList.add(true);
      else
        candiesList.add(false);

    }
    System.out.println(candiesList.toString());
  }
}
