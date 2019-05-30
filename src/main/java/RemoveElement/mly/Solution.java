package RemoveElement.mly;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums ==null ||nums.length ==0 ){
            return 0;
        }
        int cur =0;
        for (int i = 0; i<  nums.length; i++) {
            if (nums[i] != val ) {
                int swap = nums[i];
                nums[i] = nums[cur];
                nums[cur++] = swap;
            }
        }
        return cur;
    }
}
