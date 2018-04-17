# 104. [Maximum Depth of Binary Tree][1]

## 题目说明
给定一个二叉树，返回它的最大深度。

## 思路
如果当前node为null，则它的深度为0，结束。否则去递归拿左子树和右子树的深度的最大值，然后加1。

[1]: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
