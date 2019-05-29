package MoveZeroes.yuhangtdm;


/**
 * @author:yuhang
 * @Date:2019/5/29
 * 题目 将一个数组中的0往后移动,非0的其他元素保证原先的顺序 不可借用其他数组或者集合
 * 解题思路 将非0的元素往前移动
 * 如原先数组 10 0 3 0 1
 * 移动第一次 10 0 3 0 1
 * 移动第二次 10 3 0 0 1
 * 移动第三次 10 3 1 0 0
 * 可见就是把非0元素和下标从0开始依次递增的数交换位置
 */
public class MoveZeroes {

    public static void moveZeroes(Integer[] nums){
        if (nums == null || nums.length == 0){
            return;
        }
        for (int i=0,cur=0; i< nums.length; i++){
            if (nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[cur];
                nums[cur] = tmp;
                cur++;
            }
        }
    }

    public static void main(String[] args) {
        // 0 0 1
        // 1 0 0
        Integer[] nums = new Integer[]{0,1,0,3,12};
        moveZeroes(nums);
        for (Integer integer : nums) {
            System.out.print(integer+"\t");
        }
    }
}
