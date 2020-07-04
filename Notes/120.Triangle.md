# 120. Triangle

## 题目描述
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

这道题既是数组，也涉及动态规划。

## 思路
创建一个数组totalMins，数组的长度为三角的层数+1。

从三角的最下层开始，自底向上遍历。在里面嵌套从左到右循环设置当前这层的min。它可以表示i这个位置的时候取下面一层i和i+1上面得到的更小的totalMin，
然后加上这层当前i位置元素的值，得到新的i位置算到的totalMin。

```
totalMins[i] = Math.min(totalMins[i], totalMins[i + 1]) + triangle.get(level).get(i);
```
