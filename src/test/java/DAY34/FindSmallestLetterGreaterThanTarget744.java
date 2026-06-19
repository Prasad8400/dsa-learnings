package DAY34;

public class FindSmallestLetterGreaterThanTarget744 {
  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'j' };
    char target = 'c';
    char ans = letters[0];

    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < letters[mid]) {
        ans = letters[mid];
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    System.out.println(ans);
  }
}
