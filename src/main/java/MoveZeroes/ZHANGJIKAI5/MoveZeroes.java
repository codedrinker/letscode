package com.its.leet.code.leetcode.MoveZeroes;


/**
 * author：ZHANGJIKAI5
 * 解题思路：两重循环，循环数组，当判断到外层循环当前下标元素为0时，开始交换。
 * 内层循环的起始下标为外层循环的当前下标
 * 感觉应该可优化
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = { 0,1,0,3,12 };
        moveZeroes.moveZeroes(input);
        for (int i: input
        ) {
            System.out.println(i);
        }
    }
}
