package Part3;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by 周杰伦 on 2018/3/20.
 */
public class 数组里重复的数字 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0;i < length;i ++) {
            if (hashMap.containsKey(numbers[i])) {
                hashMap.put(numbers[i], hashMap.get(numbers[i]) + 1);
            }
            else hashMap.put(numbers[i], 1);
        }
        Set<Integer> set = hashMap.keySet();
        for(int i : set) {
            if (hashMap.get(i) >= 2 ) {
                duplication[0] = i;
                return true;
            }
        }
        return false;
    }
}
