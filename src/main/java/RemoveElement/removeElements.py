class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        notval_count = 0

        for i in range(0, len(nums)):
            if nums[i] != val:
                nums[notval_count] = nums[i]
                notval_count += 1

        return notval_count