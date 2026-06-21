package DAY45;

public class SmallestEvenMultiple2413 {
    public static void main(String[] args) {

        int n = 5;
        /*
         * for (int i = n; i < n * 99; i++) {
         * if (i % 2 == 0 && i % n == 0) {
         * System.out.println(i);
         * break;
         * }
         * }
         */
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(n * 2);
        }
    }

}
