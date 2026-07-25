package DAY63;

import java.util.Arrays;

public class LeetCode1929ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] ans = new int[nums.length * 2]; // Because the output array contains the original array twice, so its size
                                              // must be exactly double the original array length.

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i]; // The first half of the output array stores the original elements. By
                                            // adding nums.length to the index, I start filling the second half with the
                                            // same elements, effectively concatenating the array with itself.
        }
        System.out.println(Arrays.toString(ans));
    }

}
