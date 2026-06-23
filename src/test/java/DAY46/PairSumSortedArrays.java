package DAY46;

import java.util.*;

public class PairSumSortedArrays {
  public static void main(String[] args) {

    int[] nums = { -4, -1, -1, 0, 1, 2, -2, 4 };
    int target = 0;
    List<List<Integer>> ans = new ArrayList<>();
    int start = 0;
    int end = nums.length - 1;

    Arrays.sort(nums);

    while (start < end) {
      int sum = nums[start] + nums[end];
      if (target == sum) {
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
