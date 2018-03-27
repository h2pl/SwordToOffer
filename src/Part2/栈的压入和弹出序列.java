package Part2;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 栈的压入和弹出序列 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 3, 2, 1};
        System.out.println(IsPopOrder(a, b));
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        int i = 0;
        while (i < pushA.length) {
            stack.push(pushA[i]);
            i ++;
            while (!stack.empty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
            if (i == pushA.length) {
                if (!stack.empty()) {
                    return false;
                } else return true;
            }
        }
        return false;
        }
}
