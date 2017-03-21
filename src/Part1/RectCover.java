package Part1;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/19.
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public int RectCover(int target) {
         if(target<=0) return 0;
         if(target==1 || target==2)return target;
        int []arr=new int[target];
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<target;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[target-1];
    }
    @Test
    public void test(){
        System.out.println(RectCover(2111));
    }
}
