package com.dlq.programmerCarl.chapter4_linkedList;

/**
 * @author KznAsg
 * @version 2022/8/28  21:46
 * @page 56
 */
public class RemoveElements_UseDummyHead {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                ListNode tmp = cur.next;
                cur.next = cur.next.next;
                // delete tmp;
            } else {
                cur = cur.next;
            }
        }
        // return dummyHead.next;
        head = dummyHead.next;
        // delete dummyHead;
        return head;
    }
}
