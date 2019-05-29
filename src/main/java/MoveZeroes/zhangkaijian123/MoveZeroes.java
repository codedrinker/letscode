/**
 * @author 张铠建
 * @description
 * 题目:给定一个数组num，编写一个函数将所有0移动到它的末尾，同时保持非零元素的相对顺序。
 * 解题思路:记录第一个0的位置，与后边非零元素交换位置,cur为数组最左边的0的下标
 * @createdate 2019-05-29 09:13
 **/
public class MoveZeroes {
    public void MoveZeros(int[] nums){
        for (int i = 0,cur = 0;i < nums.length;i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[cur];
                nums[cur++] = temp;
            }
        }
    }
    //先将非零的元素移到前边，再把剩下的元素置为0
    public void MoveZeros1(int[] nums){
        int temp=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[temp++]=nums[i];
            }
        }
        for (int j = temp;j<nums.length;j++){
            nums[temp]=0;
        }
    }

}
