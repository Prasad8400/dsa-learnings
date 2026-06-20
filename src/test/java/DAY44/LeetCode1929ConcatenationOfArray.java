package DAY44;

import java.util.Arrays;

public class LeetCode1929ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }

}
