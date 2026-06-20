package DAY44;

import java.util.HashSet;
import java.util.Set;

public class LeetCode771JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        Set<Character> set = new HashSet<>();

        int count = 0;
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        System.out.println(count);
    }

}
