package com.dlq.programmerCarl.chapter4_linkedList;

/**
 * @author KznAsg
 * @version 2022/8/28  21:08
 * @page 55
 */
class RemoveElements_NoDummyHead {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = null;
        // 需要删除的节点是头节点的情况
        while (head != null && head.val == val) {
            temp = head;
            head = head.next;
            // 释放temp的操作省略，由JVM进行
        }
        // 需要删除的节点不是头结点的情况
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                temp = current.next;
                current.next = current.next.next;
                // 释放temp的操作省略，由JVM进行
            } else {
                current = current.next;
            }
        }
        return head;
    }
    
    /*
     * 更改之前的版本，有诸多和力扣上的ListNode不兼容的地方，
     * 比如用Node命名、用getter/setter设置val和next，val的名称使用了全称value
     *
    Node removeElements(Node head, int val) {
        Node temp = null;
        // 需要删除的节点是头节点的情况
        while (head != null && head.getValue() == val) {
            temp = head;
            head = head.getNext();
            // 释放temp的操作省略，由JVM进行
        }
        // 需要删除的节点不是头结点的情况
        Node current = head;
        while (current != null && current.getNext() != null) {
            if (current.getNext().getValue() == val) {
                temp = current.getNext();
                current.setNext(current.getNext().getNext());
                // 释放temp的操作省略，由JVM进行
            } else {
                current = current.getNext();
            }
        }
        return head;
    }
     */
}
