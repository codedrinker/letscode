package MoveZeroes.weichong0325;
/**
 * Create by weichong0325 on 2019/5/30
 * 解题思路：
 * 遍历数组，记录元素为0的个数为count。
 * 当前元素不为0时，其下标减去count即为数组去掉位于该元素前所有0后应处的位置，最后在末尾按count补全0。
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                count++;
            } else{
                nums[i-count]=nums[i];
            }
        }
        for(int i=nums.length-count;i<nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] intList = new int[]{0,1,0,3,12};
        moveZeroes(intList);
    }
}
/*
执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.64% 的用户
内存消耗 : 36.9 MB, 在Move Zeroes的Java提交中击败了96.14% 的用户
 */