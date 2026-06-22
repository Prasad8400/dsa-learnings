package DAY46;

public class DivisibleAndNonDivisibleSumsDifference2894 {
  public static void main(String[] args) {
    /*
     * num1 = sum of all integers in range [1, n] that are NOT divisible by m
     * num2 = sum of all integers in range [1, n] that ARE divisible by m
     */
    int n = 10;
    int m = 3;

    int nums1 = 0;
    int nums2 = 0;

    for (int i = 1; i <= n; i++) {
      if (i % m != 0)
        nums1 += i;
      else if (i % m == 0)
        nums2 += i;
    }
    System.out.println(nums1 - nums2);
  }

}
