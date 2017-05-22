# coding = UTF-8
# Given an array and a value, remove all instances of that value in place and return the new length.
# Do not allocate extra space for another array, you must do this in place with constant memory.
# The order of elements can be changed. It doesn't matter what you leave beyond the new length.
# Example:
# Given input array nums = [3,2,2,3], val = 3
# Your function should return length = 2, with the first two elements of nums being 2.
# https://leetcode.com/problems/remove-element/
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        p = 0
        q = 0
        while q < len(nums):
            if nums[q] == val:
                q = q + 1
            if q != len(nums) and nums[q] != val:
                nums[p] = nums[q]
                p = p + 1
                q = q + 1
        return p

solution = Solution()
nums = [3,2,2,3]
val = 3
print(solution.removeElement(nums, val))
print(nums)