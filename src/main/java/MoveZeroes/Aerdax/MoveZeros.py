class Solution:
    def moveZeros(self, nums):
        count0 = nums.count(0)
        for i in range(count0):
            nums.remove(0)
            nums.append(0)
        return nums
nums=input("输入数字：")
nums = [int(n) for n in nums.split()]
a=Solution()
print(a.moveZeros(nums))
