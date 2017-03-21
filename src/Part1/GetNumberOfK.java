package Part1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by 周杰伦 on 2017/3/20.
 * 题目描述
 统计一个数字在排序数组中出现的次数。
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(k==array[i])count++;
        }
        return count;
    }

    public int GetNumberOfK_bin(int [] array , int k) {
        int count=0;
        int len=array.length;
        if(len<0 || array==null)return 0;

        int num=array[len/2];
        int []leftarr;
        int []rightarr;

        //分治+递归
        //k<中间数时，说明k在数组左半边。于是统计左半边数组的k的个数。
        if(num>k){
            leftarr= Arrays.copyOfRange(array,0,len/2-1);
            count=GetNumberOfK(leftarr,k);
        }
        //k>中间数时，说明k在数组左半边。于是统计左半边数组的k的个数。
        if(num<k){
            rightarr=Arrays.copyOfRange(array,len/2,len-1);
            count=GetNumberOfK(rightarr,k);
        }
        // k=中间数时，count++,并且左侧可能还有k，于是遍历直到不等于k时说明左半边统计完毕。
        //并且右边可能还有k，于是遍历直到不等于k时说明右半边统计完毕。
        //加上左右两侧的count就是总count。
        //前边已经递归，终止条件是len=0;
        if(num==k){
            count++;
            int leftcount=0,rightcount=0;
            int leftnum=0,rightnum=0;

            for(int i=1;i<len/2;i++){
                leftnum=array[len/2-i];
                if(k==leftnum)leftcount++;
                else break;
            }
            count+=leftcount;

            for(int i=1;i<len/2;i++){
                rightnum=array[len/2+i];
                if(k==rightnum)rightcount++;
                else break;
            }
            count+=rightcount;


        }
        return count;
    }


}
