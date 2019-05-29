public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeros(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                flag ++;
            } else {
                nums[i - flag] = nums[i];
            }
        }
        for (int j = 0; j < flag ; j++) {
            nums[nums.length - 1 - j] = 0;
        }
    }
}
