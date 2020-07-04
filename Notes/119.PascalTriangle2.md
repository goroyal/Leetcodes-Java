# 118. [Pascal's Triangle II][1]

## 题目描述
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3 (从0开始的）,
Return `[1,3,3,1]`.

Note:
Could you optimize your algorithm to use only `O(k)` extra space?

## 思路
之前是给一个数，让返回整个pascal三角，这次只是让返回某一行。

创建一个list表示这行的数据。如果k<0则直接返回。

i从0遍历到k，list每次在头部加上值为1的元素。然后j从1遍历到list最后，每次设置j的位置的值为当前位置和后面位置的和。

[1]: https://leetcode.com/problems/pascals-triangle-ii/description/
