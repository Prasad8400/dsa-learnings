package javaPractice;

class Animes {
  /*
   * 🧠 this -> Refers to: current class object
   * Used for:
   * 1. current object variables
   * 2. current methods
   * 3. constructor chaining
   * this.name = name; Meaning: current object's variable
   */
  String name;
  int rank;

  // Constructor
  Animes(String name, int rank) {
    this.name = name;
    this.rank = rank;
  }

  void display() {
    System.out.println("Name: " + this.name + ", Rank: " + this.rank);
  }
}

class Goku {
  /*
   * 🧠 super -> Refers to: parent class object
   * Used for:
   * 1. parent variables
   * 2. parent methods
   * 3. parent constructor
   * super.sound(); Calls: parent class method
   */
  void makeSound() {
    System.out.print("KameHameHa...");
  }
}

class DragonBallZ extends Goku {
  void makeSound() {
    super.makeSound();
    System.out.println("Ssssss");
  }
}

public class ThisVsSuper {

  public static void main(String[] args) {
    new Animes("Naruto", 1).display();
    new DragonBallZ().makeSound();
  }
}
