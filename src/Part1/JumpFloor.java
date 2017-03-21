package Part1;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/19.
 * 题目描述
 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target<=0) return 0;
        if(target==1 || target==2)return target;
        else return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public int JumpFloorHD(int target) {
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
        System.out.println(JumpFloorHD(2111));
    }
}
