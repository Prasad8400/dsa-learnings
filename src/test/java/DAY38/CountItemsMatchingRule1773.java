package DAY38;

public class CountItemsMatchingRule1773 {
  public static void main(String[] args) {

    String[][] items = {
        { "phone", "blue", "pixel" },
        { "computer", "silver", "lenovo" },
        { "phone", "gold", "iphone" }
    };

    int index = 0;
    int count = 0;

    String ruleKey = "type";
    String ruleValue = "phone";

    if (ruleKey == "color")
      index = 1;

    if (ruleKey == "type")
      index = 0;

    if (ruleKey == "name")
      index = 2;

    for (int i = 0; i < items.length; i++) {
      String[] item = items[i];
      if (item[index].equals(ruleValue)) {
        count++;
      }
    }
    System.out.println(count);
  }

}
