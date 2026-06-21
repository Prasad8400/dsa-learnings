package DAY45;

public class CountOfMatchesInTournament1688 {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        int k = n / 2;

        while (n > 1) {
            if (n % 2 == 0) {
                int p = n / 2;
                count += p;
                n = n - p;
            } else {
                int p = (n - 1) / 2;
                count += p;
                n = n - p;
            }
        }
        System.out.println(count);
    }
}
