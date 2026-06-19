package DAY34;

public class ValidPerfectSquare367 {
  public static void main(String[] args) {

    int num = 16;
    int start = 0;
    int end = num;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      long square = (long) mid * mid;

      if (square == num) {
        System.out.println(true);
        return;
      } else if (square > num) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    System.out.println(false);
  }
}
