package RemoveElement.wangyuhuich;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 思路:快速排序
 *
 * 结果:执行用时 : 1 ms, 在Remove Element的Java提交中击败了99.59% 的用户
 *     内存消耗 : 34.5 MB, 在Remove Element的Java提交中击败了95.75% 的用户
 */

public class MoveElement {
    public static int removeElement(int[] nums, int val) {
        int valCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                valCount++;
            }
        }
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] != val && i < j) {
                i++;
            }
            while (nums[j] == val && i < j) {
                j--;
            }
            nums[j] = nums[i] + (nums[i] = nums[j]) - nums[j];
        }
        return nums.length - valCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        removeElement(arr, 3);
    }
}
