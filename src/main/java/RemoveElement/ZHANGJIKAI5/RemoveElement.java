package RemoveElement.ZHANGJIKAI5;


/**
 * author：ZHANGJIKAI5
 * 题目：27. 移除元素
 * 解题思路：题目容易进入误区，要输出数组长度，我第一想法是要copy一个数组，但是这样又没有办法做到空间复杂度O(1)
 * 审题后，发现实例里有说：你不需要考虑数组中超出新长度后面的元素。
 * 由此定义一个两个变量，一个i，记录长度；一个temp，作为交换元素的中间变量。
 */
public class RemoveElement {

    /**
     * 第一次完成：
     * 执行用时 : 1 ms, 在Remove Element的Java提交中击败了99.59% 的用户
     * 内存消耗 : 35.1 MB, 在Remove Element的Java提交中击败了85.91% 的用户
     * 第二次修改后：
     * 执行用时 : 1 ms, 在Remove Element的Java提交中击败了99.59% 的用户
     * 内存消耗 : 35 MB, 在Remove Element的Java提交中击败了86.60% 的用户
     * 第三次修改后：
     * 执行用时 : 1 ms, 在Remove Element的Java提交中击败了99.59% 的用户
     * 内存消耗 : 34 MB, 在Remove Element的Java提交中击败了100.00% 的用户
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int temp;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("数组长度：" + removeElement.removeElement(nums, val));
        for (int i : nums
             ) {
            System.out.println(i);
        }
    }

}
