package Part1;

import ADT.ListNode;
import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/19.
 * 题目描述
 * 错解一：pqr乱序
 * 错解二：pqr无法改变表头结点，并重复。
 * 正解：pq
 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
 返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class deleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode first = new ListNode(-1);//设置一个trick  
        first.next = pHead;//可能删除链表中的每个节点，需要使用头结点。
        ListNode p = pHead;//用p遍历链表。
        ListNode last = first;//用last串联链表
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                while (p != null && p.val == val)
                    p = p.next;//删除重复元素
                last.next = p;//指向一个新元素。
            } else {
                last = p;//若不重复，则last指向当前结点，再与后面结点进行串联。
                p = p.next;
            }

        }
        return first.next;
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

       ListNode node=  deleteDuplication(node1);

        while(node!=null)
        {
            System.out.println(node.val);
            node=node.next;
        }
    }
}
