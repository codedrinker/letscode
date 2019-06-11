/**
 * @author 张铠建
 * @description Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
 * Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Remove Element.
 * @createdate 2019-05-30 10:05
 **/
public class RemoveElement {
    //将nums中的val元素全部移动到数组的最后，count记录val出现的次数，nums.length-count就是去掉val后数组的长度
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == val){
                count++;
            }
        }
        for (int j = 0,cur = 0;j<nums.length;j++){
            if (nums[j] != val){
                int temp = nums[j];
                nums[j] = nums[cur];
                nums[cur++] = temp;
            }
        }
        int index = nums.length - count;
        return index;
    }
    //count为去掉val后数组的长度，将val换到数组的最后
    public int removeElement1(int[] nums, int val) {
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != val){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,3,2};
        int index = removeElement(nums,2);
        for (int i = 0;i<index;i++){
            System.out.print(nums[i]);
        }
    }
}
