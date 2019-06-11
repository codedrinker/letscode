class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        index=0
        for i in nums:
            if i!=val:
                nums[index]=i
                index+=1
        return index