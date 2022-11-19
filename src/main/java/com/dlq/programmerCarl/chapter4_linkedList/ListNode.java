package com.dlq.programmerCarl.chapter4_linkedList;

/**
 * @author KznAsg
 * @version 2022/8/28  20:58
 * @page 51
 */

public class ListNode {
    int val;
    ListNode next;
    
    public ListNode() {
    }
    
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    
    
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
    }
    
    @Override
    public String toString() {
        return "ListNode{" +
                     "value=" + val +
                     ", next=" + next +
                     '}';
    }
}