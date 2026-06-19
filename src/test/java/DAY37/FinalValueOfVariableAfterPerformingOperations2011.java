package DAY37;

public class FinalValueOfVariableAfterPerformingOperations2011 {
  public static void main(String[] args) {

    int X = 0;
    String[] operations = { "--X", "X++", "X++" };

    for (String op : operations) {
      if (op.contains("+"))
        X++;
      else
        X--;
    }
    System.out.println(X);

  }

}
