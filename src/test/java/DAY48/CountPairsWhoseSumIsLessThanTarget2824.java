package DAY48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget2824 {
  public static void main(String[] args) {
    int[] nums = { -1, 1, 2, 3, 1 };
    int target = 2;

    Arrays.sort(nums);
    int start = 0;
    int end = nums.length - 1;
    int count = 0;

    while (start < end) {
      int sum = nums[start] + nums[end];

      if (sum < target) {
        count += (end - start);
        start++;

      } else {
        end--;
      }
    }
    System.out.println(count);
  }
}
