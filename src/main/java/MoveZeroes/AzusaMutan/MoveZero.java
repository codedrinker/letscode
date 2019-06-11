public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int m;
        for(int i = 0 ; i < nums.length; i++) {
            if (nums[i] == 0) {
                m = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[m];
                        nums[m] = nums[j];
                        nums[j] = temp;
                        m = j;
                    }
                }
            }
        }
    }
}
