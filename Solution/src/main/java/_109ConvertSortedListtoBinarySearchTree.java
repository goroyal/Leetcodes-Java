public class _109ConvertSortedListtoBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		return sortedListToBST(head, null);
	}

	private TreeNode sortedListToBST(ListNode head, ListNode tail) {
		if (head == tail) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;

		// 为了让slow指针到达中间的位置
		while (fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
		}

		TreeNode node = new TreeNode(slow.val);
		node.left = sortedListToBST(head, slow);
		node.right = sortedListToBST(slow.next, tail);

		return node;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
