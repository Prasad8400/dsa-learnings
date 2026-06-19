package DAY36;

class Tree226 {
  int data;
  Tree226 lefTree226;
  Tree226 righTree226;

  Tree226(int data) {
    this.data = data;
  }
}

public class InvertBinaryTree226 {

  static void invert(Tree226 node) {

    if (node == null)
      return;

    Tree226 temp = node.lefTree226;
    node.lefTree226 = node.righTree226;
    node.righTree226 = temp;

    invert(node.lefTree226);
    invert(node.righTree226);
  }

  static void preorder(Tree226 node) {
    if (node == null)
      return;

    System.out.print(node.data + " ");

    preorder(node.lefTree226);
    preorder(node.righTree226);
  }

  public static void main(String[] args) {
    Tree226 root = new Tree226(4);

    root.lefTree226 = new Tree226(2);
    root.righTree226 = new Tree226(7);

    root.lefTree226.lefTree226 = new Tree226(1);
    root.lefTree226.righTree226 = new Tree226(3);

    root.righTree226.lefTree226 = new Tree226(6);
    root.righTree226.righTree226 = new Tree226(9);

    System.out.println("Before:");
    preorder(root);

    invert(root);

    System.out.println("\nAfter:");
    preorder(root);
  }

}
