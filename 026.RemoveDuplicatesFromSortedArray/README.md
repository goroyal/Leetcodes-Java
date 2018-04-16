# 026. [Remove Duplicates from Sorted Array][1]

## 题目描述
给一个已经排序了的数组，**原地**移除重复的元素，使得每个元素都只出现一次，同时返回原地移除后数组新的长度。

## 思路
设置2个慢快指针p和q，p设置为0，q为1。

当p还没到数组结束的时候，一直while循环。在循环里面如果发现p和q位置的数字相等，就把q指针往数组最后的方向移一位。此外如果p位置的数目比q位置的数目小，则需要把p也向前进一位，将新的p的位置的数设为当前q位置的数。

最后返回的值为p+1。

[1]: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
