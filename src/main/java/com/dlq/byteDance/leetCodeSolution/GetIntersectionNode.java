package com.dlq.byteDance.leetCodeSolution;

import com.dlq.byteDance.utils.ListNode;

/**
 * @author KazenoAsagi
 * @version 2022/7/22  13:45
 */
public class GetIntersectionNode {
    
   /*
   from: https://leetcode.cn/problems/intersection-of-two-linked-lists/solution/intersection-of-two-linked-lists-shuang-zhi-zhen-l/
   
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
    */
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        
        while (currA != currB) {
            if (currA == null) {
                currA = headB;
            } else {
                currA = currA.next;
            }
            
            if (currB == null) {
                currB = headA;
            } else {
                currB = currB.next;
            }
        }
        
        return currA;
    }
}
