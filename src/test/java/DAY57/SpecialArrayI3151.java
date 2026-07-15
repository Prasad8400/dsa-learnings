package DAY57;

public class SpecialArrayI3151 {
  /*
   * I compare each adjacent pair. If both adjacent numbers have the same
   * remainder when divided by 2, then they have the same parity, so the array is
   * not special. If no such pair is found, the array is special.
   */
  public static void main(String[] args) {

    int[] nums = { 2, 1, 4 };
    boolean isSpecial = true;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] % 2 == nums[i] % 2) {
        isSpecial = false;
        break;
      }
    }
    System.out.println(isSpecial);
  }

}
