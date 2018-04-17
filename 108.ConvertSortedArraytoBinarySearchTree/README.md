# 108. [Convert Sorted Array to Binary Search Tree][1]

## 题目描述
给一个升序的数组，把它转成一个高度平衡的二叉搜索树。

## 思路 
如果数组的长度为0，直接返回null。然后调用一个方法`sortedArrayToBST(int[] nums, int low, int high)`。

在这个方法里面，先判断，如果low大于high了，则直接返回null。取low和high的中间的位置mid，创建mid位置的值的树节点，然后递归调用该方法设置它的左子树和右子树。最后返回这个节点。


[1]: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
