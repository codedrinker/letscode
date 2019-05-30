package RemoveElement.fcbhank;

/**
 * Create by fcbhank on 2019/5/30
 * 27. Remove Element
 * 解题思路：
 * 遍历数组，记录元素为val的个数为count。
 * 当前元素不为val时，其下标减去count即为数组去掉位于该元素前所有0后应处的位置，最后在末尾按count补全val。
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i, count = 0;
        for (i = 0; i < len; i++) {
            if (nums[i] == val)
                count++;
            else
                nums[i - count] = nums[i];
        }
        for (i = len-count; i < len; i++)
            nums[i] = val;
        return len - count;
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for Remove Element.
 */
