package DAY35;

class Tree101 {
  int data;
  Tree101 left;
  Tree101 right;

  Tree101(int data) {
    this.data = data;
  }
}

public class MirrorTree101 {

  static boolean isMirror(Tree101 a, Tree101 b) {
    if (a == null && b == null)
      return true;
    if (a == null || b == null)
      return false;

    return a.data == b.data
        && isMirror(a.left, b.right)
        && isMirror(a.right, b.left);
  }

  public static void main(String[] args) {

    Tree101 p = new Tree101(2);
    p.right = new Tree101(3);

    Tree101 q = new Tree101(2);
    q.left = new Tree101(3);

    System.out.println(isMirror(p, q));
  }
}
