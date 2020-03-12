package MoveZeroes.kunlingou;

/**
 * Created by kunlingou on 2019/5/29.
 * 解题思路
 * 通过copy对象对数组进行处理
 * 1.去除0项
 * 2.补全0
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] copy = nums.clone();
        int j=0;
        for(int i=0;i<copy.length;i++) {
        	if(copy[i] != 0) {
        		nums[j] = copy[i];
        		j++;
        	}
        }
        for(int i=j;i<copy.length;i++) {
        	nums[i] = 0;
        }
    }
}
