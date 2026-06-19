package DAY38;

import java.util.ArrayList;
import java.util.List;

public class SmallerThanCurrentNumber1365 {
  public static void main(String[] args) {

    int[] nums = { 8, 1, 2, 2, 3 };
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] > nums[j])
          count++;
      }
      list.add(count);
    }
    System.out.println(list);
  }

}
