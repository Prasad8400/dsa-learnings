package DAY44;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist1346 {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 5, 3 };
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                System.out.println(true);
                return;
            }
            set.add(num);
        }
        System.out.println(false);
    }

}
