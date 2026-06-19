package DAY41;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement496 {
  public static void main(String[] args) {

    int[] nums1 = { 4, 1, 2 };
    int[] nums2 = { 1, 3, 4, 2 };
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < nums1.length; i++) {

      boolean found = false;

      for (int j = 0; j < nums2.length; j++) {

        if (nums1[i] == nums2[j]) {

          for (int k = j + 1; k < nums2.length; k++) {

            if (nums2[k] > nums1[i]) {
              result.add(nums2[k]);
              found = true;
              break;
            }
          }

          break;
        }
      }

      if (!found) {
        result.add(-1);
      }
    }

    System.out.println(result);
  }
}