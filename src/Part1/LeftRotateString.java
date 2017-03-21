package Part1;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/20.
 * 题目描述
 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 是不是很简单？OK，搞定它！
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str == null || n<=0 ||str.length()==0) return str;

        n=n%str.length();

        String left=str.substring(0,n);
        System.out.println(left);
        String right=str.substring(n,str.length());
        System.out.println(right);
        StringBuffer sb=new StringBuffer(right);
        sb=sb.append(left);
        return sb.toString();

    }

    @Test
    public void test(){
      System.out.println(LeftRotateString("",3));  ;
    }
}


