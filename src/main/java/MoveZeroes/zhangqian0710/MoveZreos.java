package MoveZeroes.zhangqian0710;

import java.util.Arrays;

/**
 * @author Miracle_Q
 * time：2019/5/29 12:51
 */
public class MoveZreos {

    public static void moveZeroes(int[] nums) {
        int k = 0;
        int len = nums.length;
        for(int i=0;i<len;i++) {
           if(nums[i] != 0) nums[k++]=nums[i];
        }
        for(int i=k;i<len;i++){
            nums[i]=0;
        }

        System.out.print(Arrays.toString(nums));
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] a = new int[] {0,0,1};
        moveZeroes(a);


    }
}
