package DAY44;

public class LeetCode2011PerformOperation {
    public static void main(String[] args) {
        String[] ops = { "--X", "X++", "X++" };
        int X = 0;

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].contains("-")) {
                X--;
            } else {
                X++;
            }
        }
        System.out.println(X);
    }

}
