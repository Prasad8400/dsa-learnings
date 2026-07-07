package DAY51;

public class GoalParserInterpretation1678 {
  public static void main(String[] args) {

    String command = "(al)G(al)()()G";
    command = command.replace("()", "o").replace("(", "").replace(")", "");
    System.out.println(command);
  }

}
