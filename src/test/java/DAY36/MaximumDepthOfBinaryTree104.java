package DAY36;

class Tree104 {
  int data;
  Tree104 left;
  Tree104 right;

  Tree104(int data) {
    this.data = data;
  }
}

/*
        3
       / \
      9  20
         / \
        15  7
 */
public class MaximumDepthOfBinaryTree104 {

  static int maxDepth(Tree104 node) {
    if (node == null)
      return 0;

    int leftDepth = maxDepth(node.left);
    int rightDepth = maxDepth(node.right);

    if (leftDepth > rightDepth)
      return leftDepth + 1;
    else
      return rightDepth + 1;

  }

  public static void main(String[] args) {
    Tree104 root = new Tree104(3);

    root.right = new Tree104(20);
    root.left = new Tree104(9);

    root.right.left = new Tree104(15);
    root.right.right = new Tree104(7);

    System.out.println(maxDepth(root));
  }
}
