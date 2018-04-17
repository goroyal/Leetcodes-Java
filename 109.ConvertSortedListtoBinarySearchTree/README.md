# 109.

## 题目说明
给一个增序的链表，将它转成高度平衡的二叉搜索树。（相对于原来的有序数组，获得链表某个位置的元素的难度增加了）

## 思路
创建一个方法`sortedListToBST(ListNode head, ListNode tail)`，初始传入的head就是链表头，tail为空。

第一步检查head是否等于tail，等于的话结束返回null。

设置2个指针，一快一慢。

fast每次走2步，slow每次走1步，记得检查fast和fast的next都不能等于tail的时候才循环，这样最后slow就是链表中间的位置。
```
while (fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
}
```
这个时候，又根原来数组的解法一样了。拿到slow节点的值创建一个树节点。然后递归生成左子树和右子树。返回该节点。
