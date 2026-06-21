package DAY45;

public class CountTheDigitsThatDivideANumber2520 {
    public static void main(String[] args) {

        int num = 121;
        int original = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (original % digit == 0) {
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
    }
}