package DAY59;

import java.util.*;

public class SortThePeople2418 {
  public static void main(String[] args) {

    String[] names = { "Mary", "John", "Emma" };
    int[] heights = { 180, 165, 170 };

    Map<Integer, String> map = new HashMap<>();

    for (int i = 0; i < names.length; i++) {
      map.put(heights[i], names[i]);
    }
    Arrays.sort(heights);

    String[] ans = new String[names.length];
    int index = 0;

    for (int i = heights.length - 1; i >= 0; i--) {
      ans[index] = map.get(heights[i]);
      index++;
    }
    System.out.println(Arrays.toString(ans));
  }

}
