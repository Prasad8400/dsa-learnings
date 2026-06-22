package DAY46;

public class AddDigits258 {
  public static void main(String[] args) {

    int num = 38;

    while (num >= 10) {
      int sum = 0;

      while (num > 0) {
        sum += num % 10;
        num /= 10;
      }
      num = sum;
    }
    System.out.println(num);
  }

}
