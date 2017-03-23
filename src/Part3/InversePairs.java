package Part3;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2017/3/23.
 * 题目描述
 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
 即输出P%1000000007
 */
public class InversePairs {
    public int Pairs=0;
    public int InversePairs(int [] array) {
        if (array.length==0 ||array==null)
            return 0;
        mergesort(array,0,array.length-1);
        return Pairs;
    }
    public void merge(int []array,int left,int mid,int right){
        //有一点很重要的是，归并分成两部分，其中一段是left到mid，第二段是mid+1到right。
        //不能从0到mid-1，然后mid到right。因为这样左右不均分，会出错。千万注意。
        //mid=(left+right)/2
        if (array.length==0 ||array==null ||left>=right)
            return ;
        int p=left,q=mid+1,k=0;

        int []temp=new int[right-left+1];

        while (p<=mid && q<=right){
            if(array[p]>array[q]){
                temp[k++]=array[q++];
                //当前半数组中有一个数i比后半个数组中的一个数j大时，由于两个数组
                //已经分别有序，所以说明i到中间数之间的所有数都比j大。
                Pairs+=mid-p+1;
            }
            else temp[k++]=array[p++];
        }

        while (p<=mid){
            temp[k++]=array[p++];}
        while (q<=right){
            temp[k++]=array[q++];}



        for (int m = 0; m < temp.length; m++)
            array[left + m] = temp[m];

    }

    public void mergesort(int []arr,int left,int right){
        if (arr.length==0 ||arr==null)
            return ;
        int mid=(right+left)/2;
        if(left<right) {
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left,mid, right);
        }
    }

    @Test
    public void test(){
        int []x={1,3,5,3,7,4,8,7,2,9};
        mergesort(x,0,x.length-1);
        System.out.println(Arrays.toString(x));
        System.out.println(InversePairs(x));
    }

}
