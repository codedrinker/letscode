package com.liuxiang.leetcode;

/**
 * @Author: liux
 * @Date: 2019/5/29 17:12
 */
public class MoveZeroes {

    //    public static void main(String[] args) {
//        int[] a ={0,0,1,2,3,4,1,0,3};
//        moveZeroes(a);
//          for(int i:a) {
//             System.out.print(i+" ");
//          }
//    }
//解题思路  不能新建数组，在原油数组上找出不等于0的元素一次放在数组的前面，等于0的数字放在数组的后面
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0) {
                nums[j++]=nums[i++];
            }else {
                i++;
            }
        }
        for(int k=j;k<nums.length;k++) {
            nums[k]=0;
        }

    }
}
