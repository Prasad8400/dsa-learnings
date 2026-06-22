package DAY46;

public class WaterBottles1518 {
  public static void main(String[] args) {

    int numBottles = 9;
    int numExchange = 3;

    int totalDrunk = numBottles;
    int emptyBottles = numBottles;

    while (emptyBottles >= numExchange) {
      int newFullBottles = emptyBottles / numExchange;
      int remainingEmptyBottles = emptyBottles % numExchange;

      totalDrunk += newFullBottles;

      emptyBottles = newFullBottles + remainingEmptyBottles;
    }

    System.out.println(totalDrunk);
  }
}