package DAY35;

class Tree {
  int data;
  Tree leftNode;
  Tree rightNode;

  Tree(int data) {
    this.data = data;
  }
}

public class BinaryTreePostOrderTraversal {

  static void postorder(Tree node) {
    if (node == null)
      return;

    postorder(node.leftNode);
    postorder(node.rightNode);

    System.out.print(node.data + " ");
  }

  public static void main(String[] args) {

    Tree root = new Tree(3);
    root.leftNode = new Tree(9);

    root.rightNode = new Tree(20);

    root.rightNode.leftNode = new Tree(15);
    root.rightNode.rightNode = new Tree(7);

    postorder(root);
  }
}