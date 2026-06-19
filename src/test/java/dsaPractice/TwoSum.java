package dsaPractice;

import java.util.*;

public class TwoSum {
  public static void main(String[] args) {

    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    Map<Integer, Integer> map = new HashMap<>(); // O(n)
    /*
     * HashMap provides O(1) average lookup time, reducing overall complexity from
     * O(n²) to O(n).
     */
    for (int i = 0; i < nums.length; i++) {
      int rem = target - nums[i];
      if (map.containsKey(rem)) {
        System.out.println(map.get(rem) + ", " + i);
        return;
      }
      map.put(nums[i], i);
    }
    System.out.println("Two numbers not present whose sum = target");
  }
}
