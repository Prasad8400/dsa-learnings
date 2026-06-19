package DAY42;

import java.util.Arrays;

public class ConcatenationOfArray1929 {
  public static void main(String[] args) {

    int[] nums = { 1, 2, 1 };
    int[] ans = new int[nums.length * 2];

    int mid = ans.length / 2;

    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[mid + i] = nums[i];
    }
    System.out.println(Arrays.toString(ans));
  }

}
