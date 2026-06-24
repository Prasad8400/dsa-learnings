package DAY48;

import java.util.*;

public class TwoSumPairs {

  public static void main(String[] args) {
    int[] arr = { -1, 1, 0, 2, -2, 44, -44 };
    int k = 0;
    Arrays.sort(arr);

    int left = 0;
    int right = arr.length - 1;

    List<List<Integer>> ans = new ArrayList<>();

    while (left < right) {
      int add = arr[left] + arr[right];

      if (add == k) {
        ans.add(Arrays.asList(arr[left], arr[right]));

        left++;
        right--;

        while (left < right && arr[left] == arr[left - 1])
          left++;

        while (left < right && arr[right] == arr[right + 1])
          right--;
      } else if (add < k) {
        left++;
      } else {
        right--;
      }
    }

    System.out.println(ans);
  }
}