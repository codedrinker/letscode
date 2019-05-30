package RemoveElement.beau0303;

/**
 * Created by IntelliJ IDEA.
 * Author:MeiFan
 * Date: 2019/5/30 13:11
 * e-mail:codemeifan@gmail.com.
 */
public class RemoveElement {
    /*双指针，i从头开始定位，j去寻找非val的元素，然后把它赋值给i，这样遍历完，前i个元素都是非val的，return i*/
    public int removeElement(int[] a, int val) {
        int i, j;
        for (i = 0, j = 0; j < a.length; j++) {
            if (a[j]!=val){
                a[i]=a[j];
                i++;
            }
        }
        return i;
    }
}
