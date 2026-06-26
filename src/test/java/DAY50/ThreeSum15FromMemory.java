package DAY50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15FromMemory {
  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -1, -4 };
    int target = 0;
    Arrays.sort(nums);
    List<List<Integer>> list = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      int start = i + 1;
      int end = nums.length - 1;

      while (start < end) {
        int sum = nums[i] + nums[start] + nums[end];
        if (sum == target) {
          list.add(Arrays.asList(nums[i], nums[start], nums[end]));
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
    System.out.println(list);
  }

}
