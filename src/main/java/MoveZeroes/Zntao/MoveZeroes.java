package MoveZeroes.Zntao;

/**
 * Created by Zntao
 */
public class MoveZeroes {
    // 通过一个变量维护前面非0的数组下标，新遍历到非零数据时与最前一个0兑换。（类似插入排序的思路）
    public static void moveZeroes(int[] nums) {

        int length = nums.length;
        int seq = 0;
        for(int i = 0; i< length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[seq] = temp;
                seq++;
            }

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
