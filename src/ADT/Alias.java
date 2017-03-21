package ADT;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/21.
 */
public class Alias {
    @Test
    public void test(){
        ListNode p=new ListNode(0);
        ListNode c=p;
        p=new ListNode(9);
        System.out.println(c.val);
    }
}
