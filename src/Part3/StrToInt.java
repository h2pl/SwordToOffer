package Part3;

import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2018/3/20.
 */
public class StrToInt {
    public static int StrToInt(String str) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < str.length();i ++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                list.add(str.charAt(i)-48);
            }
            else return 0;
        }
        int num = 0;
        int add = 1;
        for(int i = list.size()-1; i >= 0;i --) {
            num += list.get(i)*add;
            add = add*10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("123"));
    }
}
