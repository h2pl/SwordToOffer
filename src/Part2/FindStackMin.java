package Part2;
import java.util.Stack;
/**
 * 设计一个返回最小值的栈
 * Created by 周杰伦 on 2017/3/22.
 */

public class FindStackMin {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minstack=new Stack<>();

    public void push(int node) {
        if(stack.isEmpty())
        {
            stack.push(node);
            minstack.push(node);
        }
        else if(node<stack.peek()){
            stack.push(node);
            minstack.push(node);
        }
        else {
            stack.push(node);
        }
    }

    public void pop() {
        if(stack.isEmpty())return;
        if(stack.peek()==minstack.peek()){
           stack.pop();
           minstack.pop();
        }
        else {
            stack.pop();
        }
    }

    public int top() {
      return stack.peek();
    }

    public int min() {
        if(minstack.isEmpty())return 0;
     return minstack.peek();
    }
}

