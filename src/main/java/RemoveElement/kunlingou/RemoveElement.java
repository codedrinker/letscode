package RemoveElement.kunlingou;

/**
 * Created by kunlingou on 2019/5/30.
 * 解题思路
 * 通过cursor游标思想对数组进行处理
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int cur = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;
    }
}
