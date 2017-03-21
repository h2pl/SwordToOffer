package Part1;

import org.junit.Test;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 周杰伦 on 2017/3/20.
 * 题目描述
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArray {
    public void reOrderArray(int[] array) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0)arrayList1.add(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0)arrayList2.add(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(i<arrayList1.size())
            array[i]= arrayList1.get(i);
            if(i>=arrayList1.size())
            array[i]= arrayList2.get(i-arrayList1.size());
        }


    }
    @Test
    public void test(){
        int []a={3,4,1,6,8,2,5};
        reOrderArray(a);
        System.out.println(Arrays.toString(a));
    }
//    public void reOrderArray(int[] array) {
//
//        if(array==null || array.length==0)return;
//
//        int left=0,right=array.length-1;
//        int temp;
//        while (left<right){
//           while(left<right && array[left]%2!=0)
//               left++;
//           while(left<right && array[right]%2==0)
//               right--;
//            if(left<right){
//                temp=array[left];
//                array[left]=array[right];
//                array[right]=temp;
//            }
//
//        }
//    }
}
