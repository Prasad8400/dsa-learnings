package DAY37;

class Tree110 {
  int data;
  Tree110 left;
  Tree110 right;

  Tree110(int data) {
    this.data = data;
  }
}

public class BalancedBinaryTree110 {
  /*
  Input:
  
        3
       / \
      9  20
         / \
        15  7
  
  Output:
  true
   */

  static int depth(Tree110 node) {
    if (node == null)
      return 0;

    int left = depth(node.left);
    int right = depth(node.right);

    return Math.max(left, right) + 1;
  }

  static boolean isBalanced(Tree110 node) {
    if (node == null)
      return true;

    int left = depth(node.left);
    int right = depth(node.right);

    if (Math.abs(left - right) > 1)
      return false;
    return isBalanced(node.left) && isBalanced(node.right);
  }

  public static void main(String[] args) {
    Tree110 root = new Tree110(3);

    root.left = new Tree110(9);
    root.right = new Tree110(20);

    root.right.right = new Tree110(15);
    root.right.left = new Tree110(7);

    System.out.println(isBalanced(root));
  }

}
