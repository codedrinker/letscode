package MoveZeroes.zwd;

import java.util.Arrays;

/**
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * 1. 原数组上操作，不拷贝
 * 2. 尽量少的操作
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int count = 0;//为0的个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

