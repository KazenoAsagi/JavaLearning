package com.dlq.programmerCarl.chapter4_linkedList;

import org.junit.jupiter.api.Test;

class RemoveElementsTest {
    
    @Test
    void removeElements() {
        ListNode tail = new ListNode(5);
        ListNode last2 = new ListNode(4, tail);
        ListNode last3 = new ListNode(3, last2);
        ListNode last4 = new ListNode(2, last3);
        ListNode head = new ListNode(1, last4);
        System.out.println(new RemoveElements_NoDummyHead().removeElements(head, 4));
        
    }
}