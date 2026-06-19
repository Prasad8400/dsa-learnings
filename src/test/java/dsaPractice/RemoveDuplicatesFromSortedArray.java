package dsaPractice;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {

    int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
    int diff = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[diff]) {
        diff++;
        nums[diff] = nums[i];
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}
