package RemoveElement.playwithfun1995;


import java.util.Arrays;

/**
 * Created by moon-wind on 2019/5/30.
 * 将非val数据移动到数组前方 统计非val个数
 */
public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] nums = new int[8];
        int val ;
        int result = -1;

        long start = System.currentTimeMillis();
        for(int i = 100000 ; i>0 ; i--){

            nums = new int[]{3, 1, 3, 3, 4, 3, 3, 3,2,3,3};
            val = 3;
            result = removeElement.removeElement2(nums, val);
//            System.out.print(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("\ntime" + (end - start));
        System.out.println("\nend" + end);
        System.out.println("\nstart" + start);

        System.out.println(result);

        String s = Arrays.toString(nums);
        System.out.println(s);

    }


    /**
     * a few seconds ago	Accepted	0 ms	34.5 MB	java
     * 思路：前面的指针用来遍历数组 ， 找到和val值相同的元素
     *      后面的指针用来把后面的非val数依次（依次指和前置指针一一对应）挪到前指针指到的val处
     * @param nums
     * @param val
     * @return
     */

    public int removeElement(int[] nums, int val) {
        int invertedIndex = nums.length - 1;
        for(int i = 0 ; i <= invertedIndex ; i++){   // 这里要等于invertedIndex ，当i=invertedIndex且nums[i]==val时 ,invertedIndex需要指向下一个位置 以便在末尾同一加一
            // 正序找到下一个val数据
            if(nums[i] == val){
                // 倒序找到下一个非val数据
                while(nums[invertedIndex] == val && invertedIndex>i){
                    invertedIndex --;
                }

                // 将invertedIndex处的非val值赋值到i处
                nums[i] = nums[invertedIndex];
                invertedIndex --; // 移动到下一个位置

            }
        }


        return invertedIndex + 1;
    }

    /**
     * an hour ago	Accepted	0 ms	34.2 MB	java
     * 思路 count(非val) = index - count(val)
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        int index = 0;
        int count = 0;   // 统计val个数
        while (index < nums.length) {
            if (nums[index] == val) {
                count += 1;
            } else {
                // 遇到非val数据 将其移动到index-count处 因为 count(非val) = index - count(val)
                nums[index - count] = nums[index];
            }
            index += 1;
        }
        return index - count;
    }
}

