package DAY61;

public class SpecialArrayI3151Revision {
  public static void main(String[] args) {
    int[] nums = { 2, 1, 4, 5 };
    for (int i = 0; i < nums.length - 1; i++) {
      if ((nums[i + 1]) % 2 == nums[i] % 2) {
        System.out.println(false);
        return;
      }
    }
    System.out.println(true);
  }

}
