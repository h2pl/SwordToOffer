package Part2;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class 链表第一个公共节点 {
    public static void main(String[] args) {

    }

    public int length (ListNode a) {
        int len = 0;
        while (a != null) {
            len ++;
            a = a.next;
        }
        return len;
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1,len2;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int l1 = length(p1);
        int l2 = length(p2);
        int len = l1 > l2 ?(l1 - l2):(l2 - l1);
        if (l1 < l2) {
            while (len > 0) { 
                p1 = p1.next;
                len --;
            }
        }
        else if (l1 > l2) {
            while (len > 0) {
                p2 = p2.next;
                len --;
            }
        }
        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
