# 53. [Maximum Subarray][1]

## 题目描述
在一个数组里面找出一个连续子数组，使得它的元素的和最大，返回这个最大的和。

## 思路
设置2个辅助值，maxResult表示遍历整个数组之后要返回的最大的和，maxCurrent表示到某个数的时候，所要达到的最大和。一个是整体，一个是局部。

从i=1开始到数组结束，如果到某个数之前`maxCurrent > 0`，则到这个数位置，最大和可以是`maxCurrent+nums[i]`，把这个值再赋给maxCurrent。否则，maxCurrent直接等于`nums[i]`。

再比较maxResult和maxCurrent，把较大的一方重新赋值给maxResult。

最后返回maxResult。

[1]: https://leetcode.com/problems/maximum-subarray/description/
