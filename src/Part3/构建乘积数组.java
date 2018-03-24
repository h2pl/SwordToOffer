package Part3;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 构建乘积数组 {
    public int[] multiply(int[] A) {
        int []b = new int[A.length];
        int sum = 1;
        int flag = 0;
        int index = 0;
        for (int i = 0;i < A.length;i ++) {
            if (A[i] == 0 && flag ==1) {
                Arrays.fill(b, 0);
                return b;
            }
            if (A[i] == 0) {
                flag = 1;
                index = i;
                continue;
            }
            sum *= A[i];
        }
        if (flag == 1) {
            Arrays.fill(b,0);
            b[index] = sum;
            return b;
        }
        for (int i = 0;i < A.length;i ++) {
            b[i] = (int) (sum * Math.pow(A[i], -1));
        }
        return b;
    }
}
