package Part1;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/2/26.
 */
public class IntToBin {
    public static int NumberOf1(int n) {
        if (n == 0) return 0;
        int count = 0;
        for (int i = 0;i <=31; i++) {
            int temp = n;
            temp >>>= i;
            if ((temp & 1) == 1) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.toString().contains("dadas");
        System.out.println(Integer.toBinaryString(-10));
        System.out.println(NumberOf1(-10));
    }

}
