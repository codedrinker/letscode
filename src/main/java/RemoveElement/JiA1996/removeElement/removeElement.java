package com.JiA1996.removeElement;

public class removeElement {

    public static int Solution(int[] nums, int val){
        int numOfNonVal = 0; //numbers of elements that are not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[numOfNonVal] = nums[i];
                numOfNonVal += 1;
            }
        }
//
//        for (int j = 0; j < nums.length; j++) {
//            System.out.println(nums[j]);
//        }

        return numOfNonVal;
    }

    public static void main(String[] args){
        int[] intlist = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int answer = Solution(intlist, val);
        System.out.println(answer);
    }
}
