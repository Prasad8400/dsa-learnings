package DAY37;

import java.util.Arrays;

public class ShuffleTheArray1470 {
  public static void main(String[] args) {

    int[] nums = { 2, 5, 1, 3, 4, 7 };
    int n = 3;
    int[] ans = new int[nums.length];

    for (int i = 0; i < n; i++) {
      ans[2 * i] = nums[i];
      ans[2 * i + 1] = nums[i + n];
    }
    System.out.println(Arrays.toString(ans));
  }

}
