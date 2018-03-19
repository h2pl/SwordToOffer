package Part1;

import static java.lang.Math.pow;

/**
 * Created by 周杰伦 on 2018/2/25.题目描述
 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor2 {
    public int JumpFloorII(int target) {
        return (int) pow(2,target-1);

    }
}
