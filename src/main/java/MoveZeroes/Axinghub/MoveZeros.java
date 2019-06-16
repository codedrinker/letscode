
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 36.4 MB, less than 99.98% of Java online submissions for Move Zeroes.
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        for(;i<nums.length;){
            if(nums[i]!=0){
                if(i!=j){
                    nums[j++]=nums[i++];
                }else{
                    j++;
                    i++;
                }
            }else{
                i++;
            }
        }
        for(;j<nums.length;){
            nums[j++]=0;
        }
    }
}