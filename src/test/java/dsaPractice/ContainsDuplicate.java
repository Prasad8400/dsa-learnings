package dsaPractice;

import java.util.*;

public class ContainsDuplicate {
  /*
   * I used HashSet because it stores unique elements.
   * While traversing array, if element already exists in set,
   * duplicate found immediately.
   * Otherwise add element into set.
   */
  public static void main(String[] args) {

    int[] nums = { 1, 2, 3, 1 };
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (set.contains(num)) {
        System.out.println("true");
        return;
      }
      set.add(num);
    }
    System.out.println("false");
  }
}
