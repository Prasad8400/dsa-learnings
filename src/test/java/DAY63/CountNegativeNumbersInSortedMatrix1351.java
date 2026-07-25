package DAY63;

public class CountNegativeNumbersInSortedMatrix1351 {
    public static void main(String[] args) {
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        int negativeNumbers = 0;

        /*
         * First I will iterate through each rows element and heck if the number is
         * smaller than 0 or not if its is then counter will increase by 1
         */
        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    negativeNumbers++;
                }
            }
        }
        System.out.println(negativeNumbers);
    }

}
