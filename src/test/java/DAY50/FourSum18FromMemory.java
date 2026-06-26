package DAY50;

import java.util.*;

class Answer4Sum18 {
  public List<List<Integer>> ans18(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1])
          continue;
        int start = j + 1;
        int end = nums.length - 1;

        while (start < end) {
          int sum = nums[i] + nums[j] + nums[start] + nums[end];
          if (sum == target) {
            ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
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
    }
    return ans;
  }
}

public class FourSum18FromMemory {
  public static void main(String[] args) {
    /*
     * nums = {1, 0, -1, 0, -2, 2}
     * target = 0
     */
    Answer4Sum18 x = new Answer4Sum18();
    System.out.println(x.ans18(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
  }

}
