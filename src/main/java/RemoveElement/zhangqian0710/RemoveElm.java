package RemoveElement.zhangqian0710;

import java.util.Arrays;

/**
 * @author Miracle_Q
 * time：2019/5/30 10:00
 */
public class RemoveElm {

    public  static int removeElement(int[] nums, int val) {

//        题目别的思路，但是不是题目要求的O（1）:
//        String temp = Integer.toString(val);
//        String tempString = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
//        return tempString.replaceAll(temp,"").length();
        /**
         * 【思路】
         * 同理remove Zero题： 把val想象成里面的0
         */

        int k = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != val){
                nums[k++]=nums[i];
            }
        }
        return  k;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] a = new int[] {3,2,2,3};
        int b = removeElement(a,3);
        System.out.println(b);

    }

}
