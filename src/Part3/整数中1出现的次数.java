package Part3;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 整数中1出现的次数 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(1201));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1;i <= n;i ++) {
            String num = String.valueOf(i);
            char[] arr = num.toCharArray();
            for(int j = 0;j < arr.length;j ++) {
                if (arr[j] == '1') count ++;
            }
        }
        return count;
    }
}
