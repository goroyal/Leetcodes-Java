# coding = UTF-8

# Rotate an array of n elements to the right by k steps.
# For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
# Note:
# Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

class Solution(object):
    # 第一种方式是倒置数组,先后倒置前半部分、后半部分,最后整个再倒置一遍,时间复杂度 O(n),空间复杂度 O(1)
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        if k is None or k <= 0:
            return
        k, end = k % len(nums), len(nums) - 1
        self.reverse(nums, 0, end - k)
        self.reverse(nums, end - k + 1, end)
        self.reverse(nums, 0, end)

    def reverse(self, nums, start, end):
        """
        :param nums: List[int]
        :param start: int
        :param end: int
        :return: void
        """
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start, end = start + 1, end - 1

    # 第二种,直接利用了python的slice特性
    def rotate2(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        k %= len(nums)
        nums[:] = nums[-k:] + nums[:-k]