public class MoveZeroes {
    public static void movezeroes(int[] nums) {
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
