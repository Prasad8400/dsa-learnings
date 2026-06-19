package DAY39;

import java.util.*;

public class DecompressRunLengthEncodedList1313 {
  public static void main(String[] args) {

    int[] nums = { 1, 2, 3, 4 };
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < nums.length; i += 2) {
      int freq = nums[i];
      int val = nums[i + 1];

      for (int j = 0; j < freq; j++) {
        list.add(val);
      }
    }

    System.out.println(list);
  }

}
