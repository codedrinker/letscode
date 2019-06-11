package MoveZeroes.zhanweta;
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 37.7 MB, less than 99.61% of Java online submissions for Move Zeroes.
 */
public class MoveZeros {
    public static void  main(String [] args){
        //测试用
        int [] nums = {2,1};
        moveZeros(nums);
    }
    public static  void moveZeros(int [] nums){
        int posOfNoZero = 0;
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            if(nums[i] != 0){
                if(i > posOfNoZero) {
                    nums[posOfNoZero++] = nums[i];
                    nums[i] = 0;
                }else
                    posOfNoZero++;
            }
        }
        for(int num : nums)
            System.out.print(num);
    }
}
