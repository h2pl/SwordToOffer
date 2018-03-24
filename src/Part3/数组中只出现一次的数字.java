package Part3;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < array.length; i ++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            }
            else map.put(array[i], 1);
        }
        Set<Integer> set = map.keySet();
        int a1 = 0;
        for (int i : set) {
            if (map.get(i) == 1) {
                num1[0] = i;
                a1 = i;
            }
        }
        for (int i : set) {
            if (map.get(i) == 1 && i != a1) {
                num2[0] = i;
            }
        }
    }
}
