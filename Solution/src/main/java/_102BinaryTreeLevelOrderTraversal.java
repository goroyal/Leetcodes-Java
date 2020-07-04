import java.util.LinkedList;
import java.util.List;

public class _102BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		makeLevels(result, root, 0);
		return result;
	}

	private void makeLevels(List<List<Integer>> result, TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (result.size() <= level) {
			result.add(new LinkedList<>());
		}
		result.get(level).add(root.val);
		makeLevels(result, root.left, level + 1);
		makeLevels(result, root.right, level + 1);
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
