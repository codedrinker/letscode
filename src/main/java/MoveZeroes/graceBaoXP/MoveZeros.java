package cn.grace.leetcode;

/**
 * 描述:
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                int temp = nums[j - 1];
                if (nums[j - 1] == 0) {
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
