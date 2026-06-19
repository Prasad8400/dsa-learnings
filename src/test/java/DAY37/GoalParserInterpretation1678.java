package DAY37;

public class GoalParserInterpretation1678 {
  public static void main(String[] args) {

    String goal = "G()(al)";

    goal = goal.replace("()", "o");
    goal = goal.replace("(al)", "al");

    System.out.println(goal);
    /*
    StringBuilder builder = new StringBuilder();
    String str = goal.replaceAll("\\(\\)", "o");
    
    for (char c : str.toCharArray()) {
      if (Character.isLetter(c)) {
        builder.append(c);
      }
    
    }
    System.out.println(builder.toString());
    */
  }

}
