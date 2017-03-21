package Part1;

import ADT.ListNode;
import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/20.
 * 一个链表中包含环，请找出该链表的环的入口结点。
 * 先算出环中结点个数，让两个指针一起前进，一个先走环的结点个数的步长，当他们相遇时就是入口。
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null || pHead.next==null)return null;

        ListNode meetingNode=getMeetingNode(pHead);
        if(meetingNode==null)return null;
        else {
            int count=1;
            ListNode slow=meetingNode.next;
            ListNode fast=pHead;
            while (slow!=meetingNode)
            {
                slow=slow.next;
                ++count;
            }
            slow=pHead;
            for (int i = 1; i <= count; i++) {
               slow=slow.next;
            }

            while (fast!=slow) {
                if(slow!=null)
                slow = slow.next;
                if(fast!=null)
                fast = fast.next;
            }
            if(fast==null || slow==null)return null;
            else return fast;

        }
    }

    public ListNode getMeetingNode(ListNode pHead){

        if(pHead==null)return null;

        ListNode slow=pHead.next;
        if(slow==null)return null;
        ListNode fast=slow.next;

        while(fast!=null && slow!=null){
            if(fast==slow)return slow;

            slow=slow.next;
            fast=fast.next;

            if(fast!=null){
                fast=fast.next;
            }
        }
        return null;

    }

    @Test
    public void test(){
        EntryNodeOfLoop(new ListNode(0));
    }
}

