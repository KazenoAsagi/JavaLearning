package com.dlq.byteDance;

import com.dlq.byteDance.utils.ListNode;
import org.junit.Test;


/**
 * @author KazenoAsagi
 * @version 2022/7/17  13:12
 */
public class GetIntersectionNode {
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        ListNode tailA = headA;
        while (tailA.next != null) {
            tailA = tailA.next;
            lengthA++;
        }
        
        int lengthB = 0;
        ListNode tailB = headB;
        while (tailB.next != null) {
            tailB = tailB.next;
            lengthB++;
        }
        // 如果A和B有交集，最后一个节点一定一样
        if (tailA.equals(tailB)) {
            // A比B长，说明要让A调整到和B一样长度的地方
            if (lengthA > lengthB) {
                ListNode currA = headA;
                for (int i = 0; i < lengthA - lengthB; i++) {
                    currA = currA.next;
                }
                ListNode currB = headB;
                
                if (currA.equals(currB)) {
                    return currA;
                }
                for (int i = 0; i < lengthB; i++) {
                    if (currA.equals(currB)) {
                        return currA;
                    }
                    currA = currA.next;
                    currB = currB.next;
                }
            }
            // 反之B比A长
            else {
                ListNode currB = headB;
                for (int i = 0; i < lengthB - lengthA; i++) {
                    currB = currB.next;
                }
                ListNode currA = headA;
                
                if (currA.equals(currB)) {
                    return currA;
                }
                for (int i = 0; i < lengthB; i++) {
                    if (currA.equals(currB)) {
                        return currA;
                    }
                    currB = currB.next;
                    currA = currA.next;
                }
            }
        }
        return null;
    }
    
    @Test
    public void getIntersectionNodeTest() {
        // int[] intsA = {1, 2, 3, 4};
        // int[] intsB = {6, 1, 2, 3, 4};
        // ListNode headA = getNodesFromInts(intsA);
        // ListNode headB = getNodesFromInts(intsB);
        // getNodesFromInts(new int[]{1, 2});
        System.out.println(
              "getIntersectionNode(nodes(new int[]{1, 2, 3, 4}),\n" +
                    "nodes(new int[]{6, 1, 2, 3, 4})) = " +
                    getIntersectionNode(nodes(new int[]{1, 2, 3, 4}),
                          nodes(new int[]{6, 1, 2, 3, 4}))
        );
        
        System.out.println("getIntersectionNode(nodes(new int[]{1,2}), nodes(new int[]{2})) = " + getIntersectionNode(nodes(new int[]{1, 2}), nodes(new int[]{2})));
    }
    
    private ListNode nodes(int[] ints) {
        return getNodesFromInts(ints);
    }
    
    private ListNode getNodesFromInts(int[] ints) {
        if (ints.length == 0) {
            return null;
        }
        ListNode dummyNode = new ListNode(-1);
        ListNode currNode = dummyNode;
        for (int anInt : ints) {
            currNode.next = new ListNode(anInt);
            currNode = currNode.next;
        }
        return dummyNode.next;
    }
}
