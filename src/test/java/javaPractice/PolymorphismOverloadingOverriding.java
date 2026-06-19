package javaPractice;

class Naruto extends Hokage {
  void attack(String attack) {
    System.out.println("Attack Name: " + attack);
  }

  void attack(int level) {
    System.out.println("Power Level: " + level);
  }

  @Override
  void power() {
    System.out.println("Six Paths Sage Mode");
  }
}

class Hokage {
  void power() {
    System.out.println("Basic Hokage Power");
  }
}

public class PolymorphismOverloadingOverriding {
  /*
   * Method overriding is runtime polymorphism where a child class provides a
   * specific implementation of a parent class method with the same signature.
   */
  public static void main(String[] args) {
    Naruto naruto = new Naruto();
    naruto.attack("Rasengan");
    naruto.attack(3);
    naruto.power();
  }
}
