package Part2;

import ADT.ListNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2017/3/21.
 * 题目描述
 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null)return head;

        ListNode pre,next;
        pre=null;
        next=null;


        while(head!=null){
            //保存下一个结点
            next=head.next;
            //连接下一个结点
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;


    }
    @Test
    public void test(){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(4);
        ListNode node7=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        ListNode node=ReverseList(node1);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
