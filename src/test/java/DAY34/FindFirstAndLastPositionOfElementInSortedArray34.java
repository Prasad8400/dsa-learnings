package DAY34;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray34 {

  static int findFirst(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        ans = mid;
        end = mid - 1; // search LEFT
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return ans;
  }

  static int findLast(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        ans = mid;
        start = mid + 1; // search RIGHT
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;

    int first = findFirst(nums, target);
    int last = findLast(nums, target);

    System.out.println(Arrays.toString(new int[] { first, last }));
  }
}
