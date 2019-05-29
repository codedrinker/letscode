package MoveZeroes.zhangqian0710;

import java.util.Arrays;

/**
 * @author Miracle_Q
 * time：2019/5/29 12:51
 */
public class MoveZreos {

    public static void moveZeroS(int[] nums) {
        for(int i=0;i< nums.length;i++)
            for(int j=i;j<nums.length-i-1;j++){
                if(nums[j] == 0) {
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] a = new int[] {0,3,0,1,12};
        moveZeroS(a);
        System.out.print(Arrays.toString(a));


    }
}
