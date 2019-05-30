class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        nonZero_count = 0

        for i in range(0, len(nums)):
            if nums[i] is not 0:
                nums[nonZero_count] = nums[i]
                nonZero_count += 1

        for i in range(nonZero_count, len(nums)):
            nums[i] = 0
        return nums

