package DAY35;

class Tree100 {
  int data;
  Tree100 left;
  Tree100 right;

  Tree100(int data) {
    this.data = data;
  }
}

public class SameTree100 {
  static boolean isSame(Tree100 a, Tree100 b) {
    if (a == null && b == null)
      return true;
    if (a == null || b == null)
      return false;
    return a.data == b.data
        && isSame(a.left, b.left)
        && isSame(a.right, b.right);
  }

  public static void main(String[] args) {

    Tree100 p = new Tree100(1);
    p.left = new Tree100(2);
    p.right = new Tree100(3);

    Tree100 q = new Tree100(1);
    q.left = new Tree100(2);
    q.right = new Tree100(3);

    System.out.println(isSame(p, q));
  }
}
