package Part1;

import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2017/3/20.
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(array==null)return null;

        int left=0,right=array.length-1;
        while (left<right){

            if(sum>array[left]+array[right])
                left++;
            else if (sum<array[left]+array[right])
                right--;
            else {
                arrayList.add(array[left]);
                arrayList.add(array[right]);
                return arrayList;
            }
        }
        return arrayList;
    }
}
