package DAY39;


public class XOROperationArray1486 {
  public static void main(String[] args) {

    int n = 5;
    int start = 0;
    int xor = 0;

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = start + 2 * i;
    }

    for (int num : arr) {
      xor ^= num;
    }
    System.out.println(xor);

  }
}
