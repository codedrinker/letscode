package MoveZeroes.Tenderness1;

public class MoveZeroes {
    /**
     * 成功
     显示详情
     执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.69% 的用户
     内存消耗 : 40.6 MB, 在Move Zeroes的Java提交中击败了55.86% 的用户

     思路：数组中每次取两个数比较 当比较的两个数出现 第一个数为零 第二个数不为零时 交换两个数的位置
     直到把所有零置换到末尾
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 1; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            } else if (nums[j] != 0) {
                swap(nums, i++, j);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
