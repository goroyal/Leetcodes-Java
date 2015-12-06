/**
 * Created by dgq on 15/10/27.
 */
public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (root == null){
			return root;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		if (left == null){
			left = right;
			right = null;
		}
		return null;
	}
}
