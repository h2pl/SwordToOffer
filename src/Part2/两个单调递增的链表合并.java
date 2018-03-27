package Part2;

import ADT.ListNode;
import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/21.
 * 题目描述
 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class 两个单调递增的链表合并 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode head=new ListNode(-1);
        ListNode p=new ListNode(0),p1,p2;
        head=p;
        p1=list1;
        p2=list2;

        //p代表头结点，p1,p2分别遍历两个链表，接入较小值。
        //最后将p.next置为null，若还有链表剩余，直接连接其剩余部分即可。
        while(p1!=null && p2!=null){
            if(p1.val<=p2.val){
                p.next=p1;
                p1=p1.next;
                p=p.next;
            }
           else {
                p.next=p2;
                p2=p2.next;
                p=p.next;
            }
            p.next=null;
            if(p1!=null)p.next=p1;
            if(p2!=null)p.next=p2;

        }
        return head.next;
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

        node5.next=node6;
        node6.next=node7;
        ListNode node=Merge(node1,node5);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
