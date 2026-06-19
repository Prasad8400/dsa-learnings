package javaPractice;

interface Anime {
  void watch();

  void rating();

}

abstract class Shonen {
  /*
   * ✅ Abstract Class
   * Can contain:
   * normal methods
   * abstract methods
   */
  void genre() {
    System.out.println("Action Anime");
  }

  abstract void hero();
}

class OnePiece extends Shonen implements Anime {
  @Override
  public void watch() {
    System.out.println("Watching One Piece");
  }

  @Override
  public void rating() {
    System.out.println("Rating: 10/10");
  }

  @Override
  void hero() {
    System.out.println("Hero is Luffy");
  }
}

public class InterfaceAbstraction {
  /*
   * Interface is used to achieve full abstraction and define a contract.
   * Abstract class is used when we want partial abstraction along with common
   * implementation shared by subclasses.
   */
  public static void main(String[] args) {

    OnePiece op = new OnePiece();

    op.watch();
    op.rating();
    op.genre();
    op.hero();
  }

}
