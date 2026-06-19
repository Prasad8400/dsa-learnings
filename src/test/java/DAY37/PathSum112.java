package DAY37;

class Node112 {
  int data;
  Node112 left;
  Node112 right;

  Node112(int data) {
    this.data = data;
  }
}

public class PathSum112 {
  /*              
            5
          /   \
         4     8
        /     / \
      11    13   4
     /  \          \
    7    2          1
    
  */
  static boolean hasPathSum(Node112 root, int targetSum) {

    if (root == null)
      return false;

    if (root.left == null && root.right == null)
      return targetSum == root.data;

    int remainingSum = targetSum - root.data;

    return hasPathSum(root.left, remainingSum)
        || hasPathSum(root.right, remainingSum);

  }

  public static void main(String[] args) {

    Node112 root = new Node112(5);

    root.left = new Node112(4);
    root.right = new Node112(8);

    root.left.left = new Node112(11);
    root.left.left.right = new Node112(7);
    root.left.left.left = new Node112(2);

    root.right.right = new Node112(4);
    root.right.left = new Node112(13);
    root.right.right.right = new Node112(1);

    int target = 22;

    System.out.println(hasPathSum(root, target));
  }

}
