package DAY39;

class Tree543 {
  int data;
  Tree543 left;
  Tree543 right;

  Tree543(int data) {
    this.data = data;
  }
}

public class DiameterOfBinaryTree543 {
  static int diameter = 0;

  static int diameterOfTree(Tree543 node) {

    if (node == null)
      return 0;

    int left = diameterOfTree(node.left);
    int right = diameterOfTree(node.right);

    diameter = Math.max(diameter, left + right);
    return 1 + Math.max(left, right);
  }

  public static void main(String[] args) {

    /*
        1
       / \
      2   3
     / \
    4   5
    */
    Tree543 root = new Tree543(1);
    root.left = new Tree543(2);
    root.right = new Tree543(3);
    root.left.left = new Tree543(4);
    root.left.right = new Tree543(5);

    diameterOfTree(root);

    System.out.println(diameter);
  }

}
