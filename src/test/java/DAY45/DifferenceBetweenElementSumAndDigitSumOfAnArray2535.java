package DAY45;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray2535 {
    public static void main(String[] args) {
        int[] nums = { 1, 15, 6, 3 };
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;

            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10; // extract last digit
                temp = temp / 10; // remove last digit from number
            }
        }

        System.out.println(elementSum - digitSum);
    }

}
