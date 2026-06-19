package DAY36;

class TreeNodeEx {
  int data;
  TreeNodeEx left;
  TreeNodeEx right;

  TreeNodeEx(int data) {
    this.data = data;
  }
}

public class BinaryTree {
  /*
  Input:
      1
       \
        2
       /
      3
  
  Output:
  [1,2,3]
  */
  static void preorder(TreeNodeEx node) {
    if (node == null)
      return;

    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);
  }

  static void inorder(TreeNodeEx node) {
    if (node == null)
      return;

    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }

  static void postorder(TreeNodeEx node) {
    if (node == null)
      return;

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + " ");
  }

  /*
  Input:
  p = [1,2,3]
  q = [1,2,3]
  
  Output:
  true
  */
  static boolean isTreeSame(TreeNodeEx a, TreeNodeEx b) {

    if (a == null && b == null)
      return true;

    if (a == null || b == null)
      return false;

    return a.data == b.data
        && isTreeSame(a.left, b.left)
        && isTreeSame(a.right, b.right);

  }

  /*
  Input:
  
        1
      /   \
     2     2
    / \   / \
   3  4  4  3
  
  Output:
  true
   */
  static boolean isTreeMirror(TreeNodeEx node) {
    if (node == null)
      return true;
    if (node.left == null && node.right == null)
      return true;
    if (node.left == null || node.right == null)
      return false;

    return isMirror(node.left, node.right);
  }

  static boolean isMirror(TreeNodeEx a, TreeNodeEx b) {
    if (a == null && b == null)
      return true;
    if (a == null || b == null)
      return false;

    return a.data == b.data
        && isMirror(a.left, b.right)
        && isMirror(a.right, b.left);
  }

  /*
  Input:
  
        4
      /   \
     2     7
    / \   / \
   1  3  6  9
  
  Output:
  
        4
      /   \
     7     2
    / \   / \
   9  6  3  1
   */
  static void invertTree(TreeNodeEx node) {
    if (node == null)
      return;

    TreeNodeEx temp = node.left;
    node.left = node.right;
    node.right = temp;

    invertTree(node.left);
    invertTree(node.right);
  }

  /*
  Input:
  
        3
       / \
      9  20
         / \
        15  7
  
  Output:
  3
   */
  static int depthOfTree(TreeNodeEx node) {

    if (node == null)
      return 0;

    int leftDepth = depthOfTree(node.left);
    int rightDepth = depthOfTree(node.right);
    if (leftDepth > rightDepth)
      return leftDepth + 1;
    else
      return rightDepth + 1;
  }

  public static void main(String[] args) {

    //#####################################################################################
    TreeNodeEx root = new TreeNodeEx(1);
    root.right = new TreeNodeEx(2);
    root.right.left = new TreeNodeEx(3);

    System.out.println("\nPreorder");
    preorder(root);

    System.out.println("\nInorder: ");
    inorder(root);

    System.out.println("\nPostorder: ");
    postorder(root);

    //#####################################################################################

    TreeNodeEx p = new TreeNodeEx(1);
    p.left = new TreeNodeEx(2);
    p.right = new TreeNodeEx(3);

    TreeNodeEx q = new TreeNodeEx(1);
    q.left = new TreeNodeEx(2);
    q.right = new TreeNodeEx(3);

    System.out.println("\nIs Tree p and q same? " + isTreeSame(p, q));

    //#####################################################################################

    TreeNodeEx m = new TreeNodeEx(1);

    m.left = new TreeNodeEx(2);
    m.right = new TreeNodeEx(2);

    m.left.left = new TreeNodeEx(3);
    m.left.right = new TreeNodeEx(4);

    m.right.left = new TreeNodeEx(4);
    m.right.right = new TreeNodeEx(3);

    System.out.println("\nIs Tree m Mirror? " + isTreeMirror(m));

    //#####################################################################################

    TreeNodeEx i = new TreeNodeEx(4);

    i.left = new TreeNodeEx(2);
    i.right = new TreeNodeEx(7);

    i.left.left = new TreeNodeEx(1);
    i.left.right = new TreeNodeEx(3);

    i.right.left = new TreeNodeEx(6);
    i.right.right = new TreeNodeEx(9);

    System.out.println("\nBefore Inverting Tree: ");
    preorder(i);
    invertTree(i);
    System.out.println("\nAfter Inverting Tree: ");
    preorder(i);

    //#####################################################################################

    TreeNodeEx d = new TreeNodeEx(3);
    d.left = new TreeNodeEx(9);
    d.right = new TreeNodeEx(20);

    d.right.left = new TreeNodeEx(15);
    d.right.right = new TreeNodeEx(7);

    System.out.println("\nDepth Of d Tree is: "+depthOfTree(d));
  }
}
