package DAY49;

import java.util.Arrays;

class NumberGameSolution {
  public int[] numberGame(int[] nums) {
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i += 2) {
      int alice = nums[i];
      int bob = nums[i + 1];

      nums[i] = bob;
      nums[i + 1] = alice;
    }

    return nums;
  }
}

public class MinimumNumberGame2974 {
  public static void main(String[] args) {
    NumberGameSolution sol = new NumberGameSolution();
    System.out.println(Arrays.toString(sol.numberGame(new int[] { 1, 2, 3, 4, 5, 6 })));
  }

}
