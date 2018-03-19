package Part1;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/2/25.
 * 题目描述
 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 1 2 3
 2 3 4
 3 4 5
 */
public class SecondArrayFind {
    public static boolean Find(int target, int[][] array) {

        if(array[0][0] > target) {
            return false;
        }

        int row = 0;
        int col = 0;
        System.out.println(array.length);
        System.out.println(array[0].length);
        while (row < array.length && col >0) {
            if (target == array[row][col]) {
                return true;
            }
            else if (target <array[row][col]) {
                col --;
            }
            else if (target > array[row][col]) {
                col ++;
            }
            else row++;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 2;
        arr[1][1] = 3;
        arr[1][2] = 4;
        arr[2][0] = 3;
        arr[2][1] = 4;
        arr[2][2] = 5;
        System.out.println(Find(2,arr));
    }

}
