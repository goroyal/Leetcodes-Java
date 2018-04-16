# 35. [Search Insert Position][1]

## 题目描述
给定一个有序的数组和一个目标值，如果数组里面有这个值则返回所在位置，如果没有，则返回它应该按照顺序被插入的位置。（位置以0开始）

## 思路
首先要检查数组的长度，长度为0就返回0。

遍历数组，如果一个元素`nums[i] >= target`，那么就返回i。

如果一直到最后循环都没有被中断直接返回，说明这个数比所有元素都大，要放到最后，返回数组的长度。

[1]: https://leetcode.com/problems/search-insert-position/description/
