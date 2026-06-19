package DAY35;

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  TreeNode(int data) {
    this.data = data;
  }
}

public class BinaryTreeInOrderTraversal94 {

  static void inorder(TreeNode node) {
    if (node == null)
      return;
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);

  }

  public static void main(String[] args) {

    TreeNode root = new TreeNode(3);

    root.left = new TreeNode(9);
    root.right = new TreeNode(20);

    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    inorder(root);
  }

}
