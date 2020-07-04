public class _236LowestCommonAncestorOfBinaryTree {
  /**
   * @param root
   * @param p
   * @param q
   * @return 当返回null的时候说明这个节点为根的时候是找不到p和q的公共祖先的
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
  }
}
