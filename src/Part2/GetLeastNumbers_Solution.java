package Part2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by 周杰伦 on 2017/3/22.
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        if(input==null || input.length==0 ||k==0)return arrayList;

        TreeSet<Integer> treeSet=new TreeSet<>();


        for(int i=0;i<input.length;i++){
            if(treeSet.size()<k){
                treeSet.add(input[i]);
            }

            else {
                if(input[i]<treeSet.first()){
                    treeSet.remove(treeSet.first());
                    treeSet.add(input[i]);
                }
            }
        }

        for(Integer i:treeSet){
        arrayList.add(i);

        }
        return arrayList;

    }

    @Test
    public void test(){
       int []x={1,3,4,2,5,23,12,312,312,64,6,1};
        System.out.println(GetLeastNumbers_Solution(x,3));
    }
}
