package DAY49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAvgOfSmallestAndLargestEl3194 {
  /*
   * Find the smallest number.
   * Find the largest number.
   * Remove both.
   * Calculate their average.
   * Store that average.
   * Return the minimum average among all stored averages.
   */
  public static void main(String[] args) {

    // int[] nums = { 7, 8, 3, 4, 15, 13, 4, 1 };
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 8, 3, 4, 15, 13, 4, 1));

    List<Float> ans = new ArrayList<>();

    while (list.size() > 0) {
      int min = list.get(0);
      int max = list.get(0);

      for (int i = 1; i < list.size(); i++) {
        min = Math.min(min, list.get(i));
      }
      for (int i = 1; i < list.size(); i++) {
        max = Math.max(max, list.get(i));
      }
      Float avg = (float) (max + min) / 2;
      ans.add(avg);
      list.remove(Integer.valueOf(min));
      list.remove(Integer.valueOf(max));
    }

    float x = ans.get(0);
    for (float n : ans) {
      x = Math.min(x, n);
    }
    System.out.println(x);
  }

}
