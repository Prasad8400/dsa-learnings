package DAY24;

import java.util.*;

public class TwoSum {
  public static void main(String[] args) {

    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    int result = 0;
    Map<Integer, Integer> seen = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      result = target - nums[i];
      if (seen.containsKey(result)) {
        System.out.println(seen.get(result) + ", " + i);
        return;
      }
      seen.put(nums[i], i);
    }
    System.out.println("Not Found");
  }
}
