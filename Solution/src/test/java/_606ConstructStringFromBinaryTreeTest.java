import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _606ConstructStringFromBinaryTreeTest {
  private _606ConstructStringFromBinaryTree solution;

  @Before
  public void setup() {
    solution = new _606ConstructStringFromBinaryTree();
  }

  @Test
  public void test() {
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);

    node1.left = node2;
    node1.right = node3;
    node2.right = node4;

    String result = solution.tree2str(node1);

    Assert.assertEquals("1(2()(4))(3)", result);
  }
}
