package MoveZeroes.wuydit;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zero = -1;
        int next = 0;
        while (next < nums.length) {
            if (nums[next] == 0) {
                if (zero == -1) {
                    zero = next;
                }
            } else {
                if (zero >= 0) {
                    nums[zero] = nums[next];
                    nums[next] = 0;
                    zero++;
                }
            }
            next++;
        }
    }
}
