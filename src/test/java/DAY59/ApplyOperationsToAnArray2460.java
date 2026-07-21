package DAY59;

import java.util.Arrays;

public class ApplyOperationsToAnArray2460 {
  public static void main(String[] args) {

    int[] nums = { 1, 2, 2, 1, 1, 0 };

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        nums[i] = nums[i] * 2;
        nums[i + 1] = 0;
      }
    } // [1, 4, 0, 2, 0, 0]
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        j++;
      }
    }

    System.out.println(Arrays.toString(nums));
  }
}
