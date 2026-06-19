package DAY37;

import java.util.Arrays;

public class BuildArrayFromPermutation1920 {
  public static void main(String[] args) {

    int[] nums = { 0, 2, 1, 5, 3, 4 };
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      /*
      nums[nums[i]] this line taking values as index of array num
      My question - it will fail in situation like duplicate numbers
       */
      result[i] = nums[nums[i]];
    }
    System.out.println(Arrays.toString(result));
  }

}
