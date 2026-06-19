package javaPractice;

class GokuPower {
  private String power;

  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }
}

public class Encapsulation {
  /*
   * Encapsulation is the process of hiding internal data using private variables
   * and providing controlled access through public getter and setter methods.
   */
  public static void main(String[] args) {
    GokuPower goku = new GokuPower();
    goku.setPower("kamehamehaaa!!");
    System.out.println(goku.getPower());
  }
}
