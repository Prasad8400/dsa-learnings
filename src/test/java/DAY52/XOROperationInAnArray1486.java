package DAY52;

public class XOROperationInAnArray1486 {
  public static void main(String[] args) {

    int n = 5;
    int start = 0;
    int xor = 0;

    for (int i = 0; i < n; i++) {
      int num = start + 2 * i;
      xor = xor ^ num;
    }

    System.out.println(xor);
  }
}