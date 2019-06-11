package RemoveElement.Zntao;

/**
 * Created by Zntao
 */
public class RemoveElement {
    //  与昨天题目思路类似，将0替换成val
    public static int removeElement(int[] nums, int val) {

        int length = 0;
        int seq = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] != val){
                int tem = nums[i];
                nums[i] = val;
                nums[seq] = tem;
                seq++;
                length++;
            }
        }

        return length;

    }

    public static void main(String[] args) {

        int a[] = {3,2,2,3};
        int length = removeElement(a, 3);
        System.out.println(length);
        /*
        * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
          Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Remove Element.
        * */
    }
}
