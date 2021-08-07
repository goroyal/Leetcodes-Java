import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _236LowestCommonAncestorOfBinaryTreeTest {
  private _236LowestCommonAncestorOfBinaryTree solution;

  @BeforeEach
  public void  setUp() {
    solution = new _236LowestCommonAncestorOfBinaryTree();
  }

  @Test
  public void test1() {
    Integer[] nodes = new Integer[] {3,5,1,6,2,0,8,null,null,7,4};
    TreeNode root = createBinaryTree(nodes);
    TreeNode p = root.left.right;
    TreeNode q = root.right.left;

    TreeNode result = solution.lowestCommonAncestor(root, p, q);

    Assertions.assertSame(root, result);
  }

  @Test
  public void test2() {
    Integer[] nodes = new Integer[] {3,5,1,6,2,0,8,null,null,7,4};
    TreeNode root = createBinaryTree(nodes);
    TreeNode p = root.left;
    TreeNode q = root.left.right.right;

    TreeNode result = solution.lowestCommonAncestor(root, p, q);

    Assertions.assertSame(p, result);
  }

  private TreeNode createBinaryTree(Integer[] nodes) {
    if (nodes == null || nodes.length == 0) {
      return null;
    }

    TreeNode root = new TreeNode(nodes[0]);
    TreeNode[] resultNodes = new TreeNode[nodes.length + 1];
    resultNodes[1] = root;

    for (int i = 1; i < nodes.length; i++) {
      TreeNode parent = resultNodes[(i + 1)/2];
      if (parent != null && nodes[i] != null) {
        TreeNode current = new TreeNode(nodes[i]);
        if (i % 2 != 0) {
          parent.left = current;
        } else {
          parent.right = current;
        }
        resultNodes[i + 1] = current;
      }
    }
    return root;
  }
}
