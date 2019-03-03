/**
 * 记住这是一个二叉搜索树，利用它的值的特性
 */
public class Solution {
  /**
   * 二叉搜索树的特点是父节点的值比左子树大，比右子树小。
   * 如果根节点的值比要查找的2个节点值都小，那么肯定要去右子树去找。
   * 如果根节点的值比要查找的2个节点值都大，那么肯定要去左子树去找。
   * 否则就是根节点是最近公共祖先。
   * 分别对左右子树的情况也这样做递归。
   * @param root
   * @param p
   * @param q
   * @return
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;
    int max = Math.max(p.val, q.val);
    int min = Math.min(p.val, q.val);

    if (root.val > max) {
      return lowestCommonAncestor(root.left, p, q);
    } else if (root.val < min) {
      return lowestCommonAncestor(root.right, p, q);
    } else {
      return root;
    }
  }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
