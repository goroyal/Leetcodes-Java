import java.util.List;

public class Solution {
  public int maxDepth(Node root) {
    if (root == null) {
      return 0;
    }

    int max = 1;
    for (Node child : root.children) {
      int depth = 1 + maxDepth(child);
      if (depth > max) {
        max = depth;
      }
    }
    return max;
  }

  // Definition for a Node.
  class Node {
      public int val;
      public List<Node> children;

      public Node() {}

      public Node(int _val) {
          val = _val;
      }

      public Node(int _val, List<Node> _children) {
          val = _val;
          children = _children;
      }
  }
}
