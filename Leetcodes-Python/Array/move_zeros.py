# coding = UTF-8

# Given an array nums, write a function to move all 0's to the end of it
# while maintaining the relative order of the non-zero elements.
# For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
# Note:
# You must do this in-place without making a copy of the array.
# Minimize the total number of operations.
# https://leetcode.com/problems/move-zeroes/

class Solution(object):
    def moveZeroes(self, nums):
        i = 0;
        for num in nums:
            if num != 0:
                nums[i] = num
                i = i + 1
        while i < len(nums):
            nums[i] = 0
            i = i + 1

solution = Solution()
nums = [0,1,0,3,12]
solution.moveZeroes(nums)
print(nums)

