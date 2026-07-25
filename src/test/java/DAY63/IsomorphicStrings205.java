package DAY63;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings205 {
    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> usedCharacters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            char target = t.charAt(i);
            // Source character already mapped
            if (map.containsKey(source)) {
                // Mapping should always be same
                if (map.get(source) != target) {
                    System.out.println(false);
                    return;
                }
            } else {
                // Target character already assigned to another source
                if (usedCharacters.contains(target)) {
                    System.out.println(false);
                    return;
                }
                map.put(source, target);
                usedCharacters.add(target);
            }
        }

        System.out.println(true);
    }
}