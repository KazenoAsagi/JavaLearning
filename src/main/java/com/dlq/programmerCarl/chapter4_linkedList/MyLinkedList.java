package com.dlq.programmerCarl.chapter4_linkedList;

/**
 * @author KznAsg
 * @version 2022/8/28  22:20
 * @page 57
 */
public class MyLinkedList {
    private final ListNode dummyHead = new ListNode(-1);
    private int size = 0;
    
    // 这里的内部类的名字原来叫LinkedNode，为了避免重复定义，暂时弃用了
    /* private class ListNode {
        int val;
        ListNode next;
        
        public ListNode() {
        }
        
        public ListNode(int val) {
            this.val = val;
        }
        
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    } */
    
    public MyLinkedList() {}
    
    ListNode get(int index) {
        // index小于0或者index大于整个链表长度，都报错
        if (index < 0 || index > size - 1) {
            return null;
        }
        // 定义用来遍历链表查找第index个元素的节点
        ListNode cur = dummyHead.next;
        while (index > 0) {
            // 可以对index进行操作，因为函数内部的操作不会影响函数外部
            index--;
            cur = cur.next;
        }
        // 返回index元素保存的值
        return cur;
    }
    
    void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        size++;
    }
    
    void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = dummyHead;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
        size++;
    }
    
    // 这里的index是想要添加节点的位置
    void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        
        ListNode newNode = new ListNode(val);
        ListNode cur = dummyHead;
        while (index > 0) {
            index--;
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }
    
    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode cur = dummyHead;
        while (index > 0) {
            index--;
            cur = cur.next;
        }
        
        // LinkedNode tmp = cur.next;
        cur.next = cur.next.next;
        // delete tmp;
        size--;
    }
    
    void printLinkedList() {
        ListNode cur = dummyHead;
        while (cur.next != null) {
            System.out.println(cur.next.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
