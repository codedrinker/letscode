package MoveZeroes.ZHANGJIKAI5;


/**
 * author：ZHANGJIKAI5
 * 解题思路：遍历数组，判断到当前下标i的元素不为空时，代表需要与nums[j]交换位置，交换后，j++
 * 此处本来想使用异或交换元素，从而少创建一个中间变量。
 * 但两个相同值异或三重异或后会变成0，只能加一重判断，导致内存使用率没有降下来。
 */
public class MoveZeroes {


    /**
     * 执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.69% 的用户
     * 内存消耗 : 39.2 MB, 在Move Zeroes的Java提交中击败了86.28% 的用户
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        for (int i=0, j=0; i<nums.length; i++) {
                if (nums[i] != 0) {
                    if (nums[i] != nums[j]) {
                        nums[i] = nums[i] ^ nums[j];
                        nums[j] = nums[i] ^ nums[j];
                        nums[i] = nums[i] ^ nums[j];
                    }
                    j++;
                }
        }
    }

    public static void main(String[] args) {
       MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = { 2,1 };
        moveZeroes.moveZeroes(input);
        for (int i: input
        ) {
            System.out.println(i);
        }

    }
}
