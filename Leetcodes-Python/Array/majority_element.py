# code = UTF-8
# Given an array of size n, find the majority element.
# The majority element is the element that appears more than ⌊ n/2 ⌋ times.
# You may assume that the array is non-empty and the majority element always exist in the array.
class Solution(object):
    # 方法1, 先排序,然后在中间的数肯定是主要数
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        return nums[len(nums)/2]

    # 方法2,先暂时标记第一个为主要数,然后从第二个开始找,发现不一样的就将count-1,
    # 发现仍和当前数一样就将count+1,
    # count减到0之后下一个遇到的数记为主要数
    # 由于题设假定肯定存在这样的数,循环到最后majority的值就是数组里的主要数
    def majorityElement2(self, nums):
        majority = nums[0]
        count = 1
        for num in nums[1:]:
            if count == 0:
                majority = num
                count = count + 1
            elif majority == num:
                count = count + 1
            else:
                count = count - 1
        return majority
