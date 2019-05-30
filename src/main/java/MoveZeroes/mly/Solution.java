package MoveZeroes.mly;

/**
 * Created by maliyuan on 2019/5/29.
 */
public class Solution {
    public void MoveZeroes(int[] nums ){
        if (nums == null || nums.length == 0 ) {
            return;
        }
        int temp = 0;
        for (int i =0 ; i < nums.length ; i++) {
            if(nums[i] != 0 ) {
                nums[temp] = nums[i];
                temp++;
            }
        }
        for (int i = temp; i < nums.length ; i++) {
            nums[i]=0;
        }
    }
}
