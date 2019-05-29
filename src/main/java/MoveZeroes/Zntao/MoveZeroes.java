package MoveZeroes.Zntao;

/**
 * Created by Zntao
 * 解题思路
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        // 第一种：复制一份出来
        int length = nums.length;
        if(length <= 1){
            return;
        }
        int[] copyNums = new int[length];
        int j = 0;//从前开始遍历
        int k = length-1; //从后开始遍历

        for(int i = 0; i< length; i++){
            if(nums[i] == 0){
                copyNums[k] = 0;
                k--;
            }
            else {
                copyNums[j] = nums[i];
                j++;
            }

        }

        for(int i = 0; i< length; i++){
            nums[i] = copyNums[i];
        }

    }

    public static void main(String[] args) {
        int a[] = {0,1,0,3,12};
        moveZeroes(a);
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
        Memory Usage: 36.6 MB, less than 99.75% of Java online submissions for Move Zeroes.
        */
    }
}
