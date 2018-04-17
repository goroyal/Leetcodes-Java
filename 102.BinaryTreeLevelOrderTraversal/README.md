# 102. [Binary Tree Level Order Traversal][1]

## 题目描述
给一个二叉树，返回层序遍历后的结果。

## 思路
创建一个`LinkedList<LinkedList<Integer>>`, 里面的一层list表示每层的内容，而外面的一层list则装每一层数据。

创建一个`makeLevels(List<List<Integer>> result, TreeNode root, int level)`方法，一开始把root节点和0层传进去。

当外层list的元素个数不超过level大小时，表明需要有个地方放新的一层的数据，则创建一个LinkedList<Interger>元素并放入到外层list尾部。然后拿到对应层数的内层list，把值放进去。
  
对左子树和右子树递归做一样的工作。

[1]: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
