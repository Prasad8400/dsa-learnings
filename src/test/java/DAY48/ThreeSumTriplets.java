package DAY48;

import java.util.*;

public class ThreeSumTriplets {

  public static void main(String[] args) {
    int[] arr = { -1, 1, 0, 2, -2, 44, -44 };
    int k = 0;

    Arrays.sort(arr);

    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 0; i < arr.length - 2; i++) {

      if (i > 0 && arr[i] == arr[i - 1])
        continue;

      int start = i + 1;
      int end = arr.length - 1;

      while (start < end) {

        int sum = arr[i] + arr[start] + arr[end];

        if (sum == k) {

          ans.add(Arrays.asList(arr[i], arr[start], arr[end]));

          start++;
          end--;

          while (start < end && arr[start] == arr[start - 1])
            start++;

          while (start < end && arr[end] == arr[end + 1])
            end--;

        } else if (sum < k) {
          start++;
        } else {
          end--;
        }
      }
    }

    System.out.println(ans);
  }
}