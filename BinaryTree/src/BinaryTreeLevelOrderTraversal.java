import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by I320015 on 1/6/2016.
 */
public class BinaryTreeLevelOrderTraversal {
  public static void main(String[] args){
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);

    node1.left = node2;
    node1.right = node3;
    node2.left = node4;

    new BinaryTreeLevelOrderTraversal().levelOrder(node1);
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<Queue<TreeNode>> queue = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    Queue<TreeNode> levelQueue = new LinkedList<>();
    levelQueue.add(root);
    queue.add(levelQueue);

    while (queue.size()!=0){
      Queue<TreeNode> level =queue.remove();
      while (level.size()!=0){
        List<Integer> levelResult = new ArrayList<>();
        TreeNode node = levelQueue.remove();
        levelResult.add(node.val);

        Queue<TreeNode> anotherLevel = new LinkedList<>();
        anotherLevel.add(node.left);
        anotherLevel.add(node.right);
        queue.add(anotherLevel);
        result.add(levelResult);
      }
    }
    return result;
  }
}
