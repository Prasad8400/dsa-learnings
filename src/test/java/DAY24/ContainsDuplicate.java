package DAY24;

import java.util.*;

public class ContainsDuplicate {
  public static void main(String[] args) {

    int[] nums = { 1, 2, 3, 1 };
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
      if (seen.contains(num)) {
        System.out.println(true);
        return;
      }
      seen.add(num);
    }
    System.out.println(false);
  }
}
