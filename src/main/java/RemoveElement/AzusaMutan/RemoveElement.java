public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int n: nums
        ){
            if ((val ^ n) != 0) {
                nums[res++] = n;
            }
        }

        return res;
    }
}
