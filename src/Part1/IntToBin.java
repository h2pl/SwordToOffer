package Part1;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/2/26.
 */
public class IntToBin {
    public int NumberOf1(int n) {
        Stack<Integer> stack = new Stack<>();
        if(n < 0){

        }
        if (n > 0) {
            int num = 0;
            int count = 0;
            while(n>2) {
                n = n/2;
                if(n>0){
                    count ++;
                    stack.push(1);
                }
            }

        }
    return 1;
    }

}
