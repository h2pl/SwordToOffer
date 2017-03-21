package Part1;

import ADT.ListNode;

/**
 * Created by 周杰伦 on 2017/3/21.
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head==null ||k<=0)return null;
        ListNode slow=head;
        ListNode fast=head;

        for(int i=1;i<k;i++){
           if(fast.next!=null)
           fast=fast.next;
           else return null;
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }
}
