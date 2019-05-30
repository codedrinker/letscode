package RemoveElement.beau0303;

/**
 * Created by IntelliJ IDEA.
 * Author:MeiFan
 * Date: 2019/5/30 13:11
 * e-mail:codemeifan@gmail.com.
 */
public class RemoveElement {
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
