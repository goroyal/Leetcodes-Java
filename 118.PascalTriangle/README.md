# 118. [Pascal's Triangle][1]

## 题目描述
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,

Return

```
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

## 思路
先创建一个空的list，如果numRows=0，则直接返回。

然后创建第一行的元素。

从第二行开始，一直到最后一行：

每行先一开始加入值为1的元素，j从每行第二个元素开始到这行结束循环，如果还没到这行结束的话，就先拿到上一行的list取第j个数和第j-1个数相加得到当前这行j的值。如果到这行结束，则直接设为1。

将这行创建的row加入到list里。

[1]: https://leetcode.com/problems/pascals-triangle/description/
