package DAY58;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TheTwoSneakyNumbersOfDigitville3289 {
  public static void main(String[] args) {

    int[] nums = { 0, 1, 1, 0 };
    List<Integer> ans = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (set.contains(num))
        ans.add(num);
      set.add(num);
    }
    System.out.println(ans);
  }
}
