package MoveZeroes.wuydit;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int begin = 0;
        int end = nums.length;
        while (begin != end){
            if( nums[begin] == val){
                nums[begin] = nums[end-1];
                end--;
            }else {
                begin++;
            }
        }

        return begin;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println( new RemoveElement().removeElement(nums, val));
    }

}
