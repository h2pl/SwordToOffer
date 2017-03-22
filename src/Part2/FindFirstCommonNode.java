package Part2;

import ADT.ListNode;


import java.util.Stack;

/**
 * Created by 周杰伦 on 2017/3/22.
 * 题目描述
 输入两个链表，找出它们的第一个公共结点。
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null ||pHead2==null)return null;
        Stack<ListNode> stack1=new Stack<>();
        Stack<ListNode> stack2=new Stack<>();
        while (pHead1!=null)
        {
            stack1.push(pHead1);
            pHead1=pHead1.next;
        }
        while (pHead2!=null){
            stack2.push(pHead2);
            pHead2=pHead2.next;
        }
        ListNode p1=stack1.peek();
        ListNode p2=stack2.peek();
        ListNode common=null;
        while (p1==p2 &&!stack1.isEmpty() &&!stack2.isEmpty()){
            if(p1==p2)common=p1;
           stack1.pop();
           stack2.pop();
            p1=stack1.peek();
            p2=stack2.peek();

        }
        if(p1!=p2)
        return common;
        else return null;
    }
}
