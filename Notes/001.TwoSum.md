# 1. [Two Sum][1]

## 题目描述
给一个integer数组，返回相加的和等于某个数的2个数的位置。可以假设每个输入都只有唯一的结果。

## 思路
### 方案1
索引i从0到最后遍历数组，在每次循环里索引j从i+1开始遍历到最后，如果`nums[i]+nums[j] == target`则返回i和j。

空间复杂度：O(1)；

时间复杂度：O(n*n)。

### 方案2
创建一个辅助的`HashMap<Interger, Integer>`，map存放的是数组里面元素的值到元素的位置的映射。

从开始到最后遍历数组，用target减去当前的数，得到的值如果在map的key里面存在，则返回该key对应的value和当前这个数的位置；否则就把`<nums[i], i>`加入到map里面。

空间复杂度：O(n)；

时间复杂度：O(n)。

[1]: https://leetcode.com/problems/two-sum/#/description
