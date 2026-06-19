package DAY33;

public class SqrtX69 {
  public static void main(String[] args) {

    int x = 36;
    int end = x;
    int start = 0;
    int ans = 0;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      long sqrt = (long) mid * mid;

      if (sqrt == x) {
        System.out.println(mid);
        return;
      } else if (sqrt < x) {
        ans = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    System.out.println(ans);
  }

}
