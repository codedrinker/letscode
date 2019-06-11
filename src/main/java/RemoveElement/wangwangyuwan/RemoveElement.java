package RemoveElement.wangwangyuwan;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0,index=0;i<nums.length;i++){
           if(nums[i] != val){
               int temp = nums[i];
               nums[i] = nums[index];
               nums[index++] = temp;
           }else {
               ++ count;
           }
        }
        return nums.length -count;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
}
