package DAY43;

public class FindTheHighestAltitude1732 {
    public static void main(String[] args) {

        int[] gain = { -5, 1, 5, 0, -7 };
        int sum = 0;
        int max = 0;

        for (int num : gain) {
            sum += num;
            max = Math.max(max, sum);
        }
        System.out.println(max);

    }

}
