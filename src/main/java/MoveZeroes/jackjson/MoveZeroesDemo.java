package MoveZeroes.jackjson;

import java.util.*;

public class MoveZeroesDemo {

    public static Integer[] getNewArray(Integer[] array){
        //数组转集合操作, 但是有一个缺陷, 返回的是一个Arrays的静态内部类,其中并没有实现add,remove方法
        List<Integer> list = Arrays.asList(array);
        //  创建一个list
        list = new ArrayList<Integer>(list);
        //  定义一个标志, 用于记录有几个0存在
        int flag = 0;
        for(int i = 0; i < list.size(); i++) {
            if(0 == list.get(i)){
                list.remove(i);
                // 防止漏标记, 漏删除
                i--;
                flag++;
            }
        }
        // 有 0 存在的情况下再做操作
        if(flag > 0){
            for (int i = 0; i< flag; i++){
                list.add(0);
            }
        }
        //  集合转数组 等到记过并返回
        array = list.toArray(new Integer[list.size()]);
        return array;
    }


    public static void main(String[] args) {
        Integer[] array = {0,1,0,3,12};
        Integer[] newArray = getNewArray(array);
        System.out.println(Arrays.toString(newArray));
    }
}
