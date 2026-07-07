package DAY52;

import java.util.*;

public class KidsWithGreatestNumberOfCandies1431 {

  public static void main(String[] args) {

    int[] candies = { 2, 3, 5, 1, 3 };
    int extraCandies = 3;

    List<Boolean> ans = new ArrayList<>();
    int max = candies[0];

    for (int candy : candies) {
      max = Math.max(candy, max);
    }

    for (int i = 0; i < candies.length; i++) {
      int extra = candies[i] + extraCandies;
      if (extra >= max)
        ans.add(true);
      else
        ans.add(false);
    }
    System.out.println(ans);
  }

}
