package DAY63;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    /*
     * Given an integer array nums, return the majority element.
     * The majority element is the element that appears more than n/2 times.
     * You may assume the majority element always exists.
     */
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // Stroing in hashmap element and its frequency and by size divide by 2 will
        // iterating through hashmap to check frequency
        int len = nums.length / 2;
        for (int num : nums) {
            if (map.get(num) > len) {
                System.out.println(num);
                break;
            }
        }
    }
}
