package DAY35;

class TreeNodes1 {
  int data;
  TreeNodes1 right;
  TreeNodes1 left;

  TreeNodes1(int data) {
    this.data = data;
  }
}

// 3
// / \
// 9 20
// / \
// 15 7

public class BinaryTreeNodePreOrderTraversal144 {

  static void preorder(TreeNodes1 node) {

    if (node == null)
      return;

    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);

  }

  public static void main(String[] args) {

    TreeNodes1 root = new TreeNodes1(3);

    root.left = new TreeNodes1(9);
    root.right = new TreeNodes1(20);

    root.right.left = new TreeNodes1(15);
    root.right.right = new TreeNodes1(7);

    preorder(root);
  }
}
