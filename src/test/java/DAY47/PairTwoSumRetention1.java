package DAY47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairTwoSumRetention1 {
  public static void main(String[] args) {
    int[] nums = { -4, -1, -1, 0, 1, 2, -2, 4 };
    int target = 0;
    int start = 0;
    int end = nums.length - 1;
    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(nums);

    while (start < end) {
      int sum = nums[start] + nums[end];

      if (sum == target) {
        ans.add(Arrays.asList(nums[start], nums[end]));
        start++;
        end--;
      } else if (sum < target) {
        start++;
      } else {
        end--;
      }

    }
    System.out.println(ans);
  }

}
