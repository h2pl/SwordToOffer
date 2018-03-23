package Part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by 周杰伦 on 2018/3/23.
 * 使用桶排序
 */
public class 把数组排成最小整数 {
    public static void main(String[] args) {
        int []a = {3,32,321};
        System.out.println(PrintMinNumber(a));
    }
    public static String PrintMinNumber(int [] numbers) {
        int size = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = String.valueOf(o1);
                String b = String.valueOf(o2);
                return (a + b).compareTo(b + a);
            }
        });
        StringBuffer sb = new StringBuffer();
        for (int i : list) {
            sb.append(i);
        }

        return sb.toString();
    }
}
