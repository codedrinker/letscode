package MoveZeroes.wangyuhuich;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */

/**
 * 解题思路:类似冒泡,数字0 上浮
 */


public class MoveZeroes {
    /**
     * 执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.69% 的用户
     * 内存消耗 : 39.9 MB, 在Move Zeroes的Java提交中击败了72.80% 的用户
     */
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int notZeroPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                zeroCount+=1;
            }else{
                nums[notZeroPosition++] = nums[i];
            }
        }
        for (int i = notZeroPosition,j = 0; j < zeroCount; i++,j++) {
            nums[i] = 0;
        }
    }

    /**
     * 执行用时 : 122 ms, 在Move Zeroes的Java提交中击败了5.07% 的用户
     * 内存消耗 : 40.6 MB, 在Move Zeroes的Java提交中击败了54.19% 的用户
     */
//    @Deprecated
//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length-i-1; j++) {
//                if (nums[j] == 0 && nums[j + 1] != 0) {
//                    nums[j] = nums[j + 1] + (nums[j + 1] = nums[j]) - nums[j];
//                }
//            }
//        }
//    }
}