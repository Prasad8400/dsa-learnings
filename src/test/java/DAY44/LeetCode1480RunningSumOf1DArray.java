package DAY44;

import java.util.Arrays;

public class LeetCode1480RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        System.out.println(Arrays.toString(nums));
    }

}
