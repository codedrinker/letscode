package MoveZeroes.wangwangyuwan;

import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int nums[]){
        int index = 0;
        for (int i=0;i<nums.length;i++){
            if (0 != nums[i]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                ++ index;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

}
