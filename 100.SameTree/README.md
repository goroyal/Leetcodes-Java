# 100. [Same Tree][1]

## 题目描述
给2个二叉树，写一个方法判断它们是不是相同的树。

## 思路
如果给的2个二叉树的根指针都为null，则肯定相同。如果一个为null一个不为null则肯定不同。在都不为空的情况下，比较它们的值，然后再分别递归比较它们的左子树和右子树。

[1]: https://leetcode.com/problems/same-tree/description/
