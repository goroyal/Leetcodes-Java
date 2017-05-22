# coding = UTF-8

# Given an array of integers and an integer k, find out
# whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
# and the absolute difference between i and j is at most k.

class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        dic = {}
        for i, value in enumerate(nums):
            if value in dic and i - dic[value] <= k:
                return True
            dic[value] = i
        return False
