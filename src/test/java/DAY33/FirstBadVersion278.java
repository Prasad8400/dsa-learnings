package DAY33;

public class FirstBadVersion278 {

  static int bad = 4;

  static boolean isBad(int ver) {
    return ver >= bad;
  }

  public static void main(String[] args) {

    int n = 5;
    int start = 0;
    int end = n;
    int result = 0;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (isBad(mid)) {
        result = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    System.out.println(result);
  }
}
