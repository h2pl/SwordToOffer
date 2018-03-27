package Part2;

import org.junit.Test;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by 周杰伦 on 2017/3/22.
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class 找出其中最小的K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        if(input==null || input.length==0 ||k==0 ||k>input.length)return arrayList;

        TreeSet<Integer> treeSet=new TreeSet<>();


        for(int i=0;i<input.length;i++){
            if(treeSet.size()<k){
                treeSet.add(input[i]);
            }

            else {

                if(input[i]<treeSet.last()){
                    treeSet.pollLast();
                    treeSet.add(input[i]);
                }
            }
        }

        for(Integer x:treeSet){
        arrayList.add(x);

        }
        return arrayList;

    }

    @Test
    public void test(){
       int []x={1,3,4,8,5,7,2,312,312,64,11,6};
        System.out.println(GetLeastNumbers_Solution(x,7));
    }
}
