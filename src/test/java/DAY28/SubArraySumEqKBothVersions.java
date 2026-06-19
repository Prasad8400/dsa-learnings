package DAY28;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqKBothVersions {
  public static void main(String[] args) {

    int[] nums = { 1, 1, 1 };
    int k = 2;
    int sum = 0;
    int count = 0;

    Map<Integer, Integer> seen = new HashMap<>();
    seen.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (seen.containsKey(sum - k)) {
        count += seen.get(sum - k);
      }
      seen.put(sum, seen.getOrDefault(sum, 0) + 1);
    }
    System.out.println(count);
    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // for (int j = i; j < nums.length; j++) {
    // sum += nums[j];
    // if (sum == k) {
    // count++;
    // }
    // }
    // }
    // System.out.println(count);
  }

}
