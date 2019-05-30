package MoveZeroes.fcbhank;

/**
 * Create by fcbhank on 2019/5/29
 * 283. Move Zeroes，时间复杂度O(n)
 * 解题思路：
 * 遍历数组，记录元素为0的个数为count。
 * 当前元素不为0时，其下标减去count即为数组去掉位于该元素前所有0后应处的位置，最后在末尾按count补全0。
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int count=0;
        for (int i = 0; i < size; i++) {
            if(nums[i]==0)
                count++;
            else
                nums[i-count]=nums[i];
        }
        for(int i=size-count;i<size;i++)
            nums[i]=0;
    }
}
/*
结果：
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 35.6 MB, less than 99.98% of Java online submissions for Move Zeroes.
 */
