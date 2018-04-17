# 107. Binary Tree Level Order Traversal 2

## 题目说明
给定一个二叉树，返回自底向上的层序遍历的结果。（原来的1是自顶向下）

## 思路
还是用一个`LinkedList<LinkedList<Integer>>`, 也还是创建一个`makeLevels(List<List<Integer>> list, TreeNode root, int level)`方法。

如果传进来的节点为空，则当前方法结束。如果外层list的元素数量不超过level，表示需要新加一层，创建一个`LinkedList<Integer>`并加入到**头部**。

接下来还有更重要的和之前不同的是：

**先递归左子树和右子树，最后将当前的节点的值加入到外层`list.size() - 1 - level`所得到的内层list里面。**

[1]: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
