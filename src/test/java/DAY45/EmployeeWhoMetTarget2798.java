package DAY45;

public class EmployeeWhoMetTarget2798 {
    public static void main(String[] args) {
        int[] hours = { 0, 1, 2, 3, 4 };
        int target = 2;

        int count = 0;

        for (int hour : hours) {
            if (target <= hour)
                count++;
        }
        System.out.println(count);
    }

}
