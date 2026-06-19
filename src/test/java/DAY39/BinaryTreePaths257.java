package DAY39;

import java.util.*;

class Tree257 {
  int data;
  Tree257 left;
  Tree257 right;

  Tree257(int data) {
    this.data = data;
  }
}

public class BinaryTreePaths257 {

  static void findPaths(Tree257 node, String path, List<String> result) {
    if (node == null)
      return;

    if (path.length() == 0)
      path = "" + node.data;
    else
      path = path + "->" + node.data;

    if (node.left == null && node.right == null) {
      result.add(path);
      return;
    }

    findPaths(node.left, path, result);
    findPaths(node.right, path, result);
  }

  public static void main(String[] args) {
    Tree257 root = new Tree257(1);
    root.left = new Tree257(2);
    root.right = new Tree257(3);
    root.left.right = new Tree257(5);

    List<String> result = new ArrayList<>();

    findPaths(root, "", result);

    System.out.println(result);
  }
}