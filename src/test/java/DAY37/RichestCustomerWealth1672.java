package DAY37;

public class RichestCustomerWealth1672 {
  public static void main(String[] args) {

    int[][] accounts = {
        { 1, 5 },
        { 7, 3 },
        { 3, 5 }
    };
    int max = 0;

    for (int i = 0; i < accounts.length; i++) { //2
      int[] account = accounts[i];
      int sum = 0;
      for (int ac : account) {
        sum += ac;
      }
      max = Math.max(max, sum);
    }
    /*
    for (int[] account : accounts) {
    int sum = 0;
    for (int ac : account) {
        sum += ac;
    }
    max = Math.max(max, sum);
    }
    */
    System.out.println(max);
  }

}
