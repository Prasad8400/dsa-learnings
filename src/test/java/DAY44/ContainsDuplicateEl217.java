package DAY44;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateEl217 {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1 };
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                System.out.println(true);
                return;
            }
            set.add(num);
        }
        System.out.println(false);
    }

}
