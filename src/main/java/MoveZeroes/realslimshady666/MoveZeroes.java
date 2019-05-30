package MoveZeroes.realslimshady666;


/**
 * @author realslimshady666
 * <p>
 * 思路：不为0的移至前面，后面的用0补全
 */
public class MoveZeroes {

    /**
     * 行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.69% 的用户
     * 内存消耗 : 40.5 MB, 在Move Zeroes的Java提交中击败了56.77% 的用户
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
