package DAY51;

import java.util.*;

public class JewelsAndStones771PostVacation {
  public static void main(String[] args) {

    String jewels = "aA";
    String stones = "aAAbbbb";
    int count = 0;

    Set<Character> set = new HashSet<>();

    for (char c : jewels.toCharArray()) {
      set.add(c);
    }

    for (char c : stones.toCharArray()) {
      if (set.contains(c))
        count++;
    }
    System.out.println(count);
  }

}
