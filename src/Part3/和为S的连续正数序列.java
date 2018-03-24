package Part3;

import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 和为S的连续正数序列 {
    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(9));
    }
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int []num = new int[(int) Math.ceil(sum/2.0)];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0;i < num.length;i ++) {
            num[i] = i + 1;
        }
        int temp = 0;
        int i = 0,j = i + 1;
        while (i < num.length && j < num.length) {
            temp = 0;
            for (int k = i;k <= j;k ++) {
                temp += num[k];
            }
            if (temp < sum) j ++;
            else if (temp > sum) i++;
            else {
                ArrayList<Integer> sublist = new ArrayList<>();
                for (int k = i;k <= j;k ++) {
                    sublist.add(num[k]);
                }
                list.add(sublist);
                i ++;
                j ++;
            }
        }
        return list;
    }
}
