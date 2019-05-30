public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int numOfNonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[numOfNonZero] = nums[i];
                numOfNonZero++;
            }
        }

        int numOfZero = nums.length - numOfNonZero;

        for (int j = numOfZero; j > 0 ; j--) {
            nums[nums.length - j] = 0;
        }

//        for (int k = 0; k < nums.length; k++) {
//            System.out.println(nums[k]);
//        }
    }

    public static void main(String[] args) {
        int[] intList = new int[]{0,1,0,3,12};
        moveZeroes(intList);
    }
}
