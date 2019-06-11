import java.util.Arrays;

public class ArrayTest {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {

            } else {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i < nums.length) {
            nums[i]=0;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {

            } else {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while (i < nums.length) {
            nums[i]=0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
