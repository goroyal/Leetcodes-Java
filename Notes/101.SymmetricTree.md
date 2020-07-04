# 101. [Symmetric Tree][1]

## 题目描述
给定一个二叉树，检查它是否对称。

## 思路
如果根节点为空，直接返回true。

如果根节点不为空，下面比较它的左子树和右子树。如果左右都为空，那么是对称的，返回true。如果一个为空，一个不为空，返回false。

如果左右都不为空，比较左右的值，再递归比较左的左子树和右的右子树，以及左的右子树和右的左子树。

[1]: https://leetcode.com/problems/symmetric-tree/description/
