package Part3;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 丑数 {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(6));
    }
    public static int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;
        int []res = new int[index];
        res[0] = 1;
        int i2,i3,i5;
        i2 = i3 = i5 = 0;
        for (int i = 1;i < index;i ++) {
            res[i] = Math.min(res[i2] * 2, Math.min(res[i3] * 3, res[i5] * 5));
            if (res[i] == res[i2] * 2) i2 ++;
            if (res[i] == res[i3] * 3) i3 ++;
            if (res[i] == res[i5] * 5) i5 ++;
        }
        return res[index - 1];
    }
}
