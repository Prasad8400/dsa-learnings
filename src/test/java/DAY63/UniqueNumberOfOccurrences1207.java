package DAY63;

import java.util.*;

public class UniqueNumberOfOccurrences1207 {
    /*
     * I will store arr elements as key and its frequency as value in map then using
     * hashset and Entry will check dulicate frequency
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                System.out.println(false);
                return;
            }
            set.add(entry.getValue());
        }
        System.out.println(true);
    }

}
