package Part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 第一次只出现一次的字符 {
    public int FirstNotRepeatingChar(String str) {
        if (str.equals("")) return -1;
        if (str.length() == 1) return 0;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        ArrayList<Character> list = new ArrayList<>();
        if (arr[0] != arr[1])list.add(arr[0]);
        if (arr[arr.length - 1] != arr[arr.length - 2])list.add(arr[arr.length - 1]);
        for (int i = 0;i < arr.length - 1;i ++) {
            if (arr[i] == arr[i + 1])continue;
            else if(i + 2 < arr.length && arr[i + 1] != arr[i + 2]) {
                list.add(arr[i + 1]);
            }
        }
        int index = arr.length - 1;
        for (char c : list) {
            if (str.indexOf(c) < index) {
                index = str.indexOf(c);
            }
        }
        return index;
    }
}
