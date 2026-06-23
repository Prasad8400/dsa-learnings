package DAY46;

import java.util.*;

public class ThreeSumSortedArray {
  public static void main(String[] args) {
    int[] nums = { -4, -1, -1, 0, 1, 2 };
    int target = 0;

    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {

      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      int start = i + 1;
      int end = nums.length - 1;

      while (start < end) {
        int sum = nums[i] + nums[start] + nums[end];
        if (sum == target) {
          ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
          start++;
          end--;

          while (start < end && nums[start] == nums[start - 1])
            start++;
          while (start < end && nums[end] == nums[end + 1])
            end--;

        } else if (sum < target) {
          start++;
        } else {
          end--;
        }
      }
    }
    System.out.println(ans);
  }

}
