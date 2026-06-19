package DAY38;

public class ToLowerCase709 {
  public static void main(String[] args) {

    String str = "LOVELY";
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
      sb.append(Character.toLowerCase(c));
    }
    System.out.println(sb.toString());
  }
}
