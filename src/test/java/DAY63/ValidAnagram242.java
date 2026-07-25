package DAY63;

import java.util.*;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        // first check if length of both strings are similar if not it cannot be anagram
        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();

        for (char c : s.toCharArray()) {
            a.put(c, a.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            b.put(c, b.getOrDefault(c, 0) + 1);
        }

        // After creating 2 maps and storing string char to map will checking the char
        // and frequncy is same
        System.out.println(a.equals(b));
    }
}
