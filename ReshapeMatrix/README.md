# 566. [Reshape the Matrix][1]

## Tag
Array

## Description
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

在MATLAB中有个非常有用的方法叫做“reshape”，它可以将一个矩阵转换成一个新的大小不同的矩阵但是保持它原来的数据。

给你一个通过二维方式表示的矩阵，以及两个分别表示reshape之后矩阵期待的行和列的数量的正整数r、c。

reshape后的矩阵需要按照相同的行遍历顺序拥有原来矩阵的所有元素。

如果给定参数的“reshape”操作是可行的、合法的，输出新的reshape之后的矩阵；否则，输出原来的矩阵。

### Example 1

```
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4

Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. 
The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
```

### Example 2

```
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
```

### Note
The height and width of the given matrix is in range `[1, 100]`.

The given r and c are all positive.

## Hints
1. Do you know how 2d matrix is stored in 1d memory? Try to map 2-dimensions into one.

2. `M[i][j]=M[n*i+j]` , where n is the number of cols. This is the one way of converting 2-d indices into one 1-d index. Now, how will you convert 1-d index into 2-d indices?

3. Try to use division and modulus to convert 1-d index into 2-d indices.

4. `M[i] => M[n/i][n%i]` Will it result in right mapping? Take some example and check this formulae.

[1]: https://leetcode.com/problems/reshape-the-matrix