package Part1;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2017/3/20.题目描述
 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str.trim().equals(""))return str;
        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        int i;
        for (i = a.length-1; i >=0;i--){
            o.append(a[i]);
            if(i>0)o.append(" ");
        }
        return  o.toString();
//
//        Stack<String > stack=new Stack<>();
//        int start=0;
//        int flag=0;
//        char []chararr=str.toCharArray();
//        System.out.println(chararr[0]);
//        for(int i=0;i<str.length();i++){
//
//            if(chararr[i]==' '){
//                flag=1;
//                if(i-1<start)i++;
//                String a=str.substring(start,i-1);
//                stack.push(a);
//                start=i+1;
//            }
//            if(i==str.length()-1){
//                String b=str.substring(start,i);
//                stack.push(b);
//            }
//        }
//        if(flag==0)return str;
//
//        StringBuffer result=new StringBuffer("");
//        while (!stack.isEmpty())
//        {
//            StringBuffer stringBuffer=new StringBuffer(stack.pop());
//            result=result.append(stringBuffer);
//            if(!stack.isEmpty())
//            result=result.append(" ");
//        }
//
//        return result.toString();



    }

    @Test
    public void test(){
        System.out.println(ReverseSentence(" "));
    }
}
