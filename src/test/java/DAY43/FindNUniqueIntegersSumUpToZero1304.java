package DAY43;

import java.util.*;

public class FindNUniqueIntegersSumUpToZero1304 {
    public static void main(String[] args) {

        int n = 5;
        int[] nums = new int[n];

        for (int i = 0; i < n / 2; i++) {
            nums[i] = i + 1;
            nums[n - i - 1] = -(i + 1);
        }

        System.out.println(Arrays.toString(nums));

    }

}
