package DAY39;

public class FindNumbersWithEvenNumberOfDigits1295 {
  public static void main(String[] args) {

    int[] nums = { 12, 345, 2, 6, 7896 };
    int count = 0;

    for (int num : nums) {
      String s = String.valueOf(num);
      if (s.length() % 2 == 0)
        count++;
    }
    System.out.println(count);
  }
}
