package Part3;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/3/19.
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class 出现次数超过数组一半的数字 {
    public static int MoreThanHalfNum(int [] array) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < array.length;i ++){
            int num = array[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num) +1);
            }else map.put(num, 1);
        }
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            if(map.get(i) > array.length/2) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum(arr));
    }
}
