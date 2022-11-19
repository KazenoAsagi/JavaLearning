package com.dlq.programmerCarl.chapter4_linkedList;

/**
 * @author KznAsg
 * @version 2022/9/4  22:48
 * @page 61
 */
public class ReverseListSolution {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(1);
        l.addAtHead(2);
        l.addAtHead(3);
        l.addAtHead(4);
        l.addAtHead(5);
        l.printLinkedList();
        
        new ReverseListSolution().reverseList(l.get(0));
        l.printLinkedList();
        
        new ReverseListSolution().myReverseList1(l.get(0));
        l.printLinkedList();
    }
    
    // 自己依靠记忆写一遍 2022-09-04 23:25
    
    // 抄书
    ListNode reverseList(ListNode head) {
        // 保存cur的下一个节点
        ListNode temp;
        ListNode cur = head;
        ListNode pre = null;
        
        while (cur != null) {
            // 保存cur的下一个节点，因为接下来要改变cur.next的指向了
            temp = cur.next;
            cur.next = pre;
            // 更新pre和cur指针
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    
    ListNode myReverseList1(ListNode head) {
        ListNode temp = null;
        ListNode cur = head;
        ListNode pre = null;
        
        // 先不妨假设链表的左侧叫做头部，右侧叫做尾部，这个函数做的工作，就是从左侧一直执行翻转操作，直到右侧
        
        // cur会从链表左侧一直执行操作，直到尾部，最终变为null，所以退出条件是当cur变为null时。
        while (cur != null) {
            // 保存好cur.next，保存好链表的剩余部分
            temp = cur.next;
            // 反转方向：让cur的指向从向右变成向左
            cur.next = pre;
            
            // 干完活了，为下一次执行做准备
            // 先把pre变成和cur一样
            pre = cur;
            // 然后把之前在temp保存的链表右侧部分拿回来
            cur = temp;
            // 干完了，cur已经准备好作为第二次循环的起始坐标
        }
        // 干完所有翻转的活的时候，cur肯定为null（因为while已经跳出），所以我们要返回的是null之前的一个节点，是pre
        return pre;
    }
}
