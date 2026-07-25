package DAY63;

public class LeetCode2011FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        int X = 0;
        String[] operations = {
                "--X",
                "X++",
                "X++"
        };

        for (String op : operations) {
            if (op.contains("+")) // If Operation is having + it will increase number by once hence added if
                                  // statment
                X++;
            else // if not + then do minus
                X--;
        }
        System.out.println(X);
    }

}
