import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		makeLevels(result, root, 0);
		return result;
	}

	private void makeLevels(List<List<Integer>> list, TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (list.size() <= level) {
			// 在头部加入一个新的链表
			list.add(0, new LinkedList<>());
		}
		makeLevels(list, root.left, level + 1);
		makeLevels(list, root.right, level + 1);
		list.get(list.size() - 1 - level).add(root.val);
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
