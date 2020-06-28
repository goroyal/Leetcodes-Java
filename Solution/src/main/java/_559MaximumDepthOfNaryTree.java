public class _559MaximumDepthOfNaryTree {
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
}
