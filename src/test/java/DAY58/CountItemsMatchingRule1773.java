package DAY58;

public class CountItemsMatchingRule1773 {
  public static void main(String[] args) {

    String[][] items = {
        { "phone", "blue", "pixel" },
        { "computer", "silver", "lenovo" },
        { "phone", "gold", "iphone" }
    };

    String ruleKey = "color";
    String ruleValue = "silver";
    int count = 0;

    int val = 0;
    if (ruleKey.equals("type"))
      val = 0;
    else if (ruleKey.equals("color"))
      val = 1;
    else
      val = 2;

    for (String[] item : items) {
      if (item[val].equals(ruleValue)) {
        count++;
      }
    }

    System.out.println(count);

  }

}
