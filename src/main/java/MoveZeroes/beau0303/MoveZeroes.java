package MoveZeroes.beau0303;

/**
 * Created by IntelliJ IDEA.
 * Author:MeiFan
 * Date: 2019/5/29 15:37
 * e-mail:codemeifan@gmail.com.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] a) {
        if (a.length == 1)
            return;
        for (int cur = 0, i = cur; i < a.length; cur++, i++) {
            if (0 == a[cur]) { //cur定位到第一个0的位置，i去寻找后面第一个非0的值替换过来
                while (i < a.length && a[i] == 0) {
                    i++;
                }
                if (i >= a.length)//判断是否被越界 如果越界 说明后面没有非0元素 直接返回
                    break;
                swap(a, i, cur);
            }
        }
    }

    public static void swap(int a[], int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[j] ^ a[i];
        a[i] = a[i] ^ a[j];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 0, 5, 0};
        moveZeroes(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
