package com.lsw.leetcode.medium;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/14.
 */
public class RotateList61 {
    @Test
    public void test(){
        ListNode listNode10 = new ListNode(1);
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(3);
        ListNode listNode13 = new ListNode(4);
        ListNode listNode14 = new ListNode(5);
        listNode10.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;

        ListNode node = rotateRight(listNode10,5);
        while(node !=null){
            System.out.print(node.val);
            node = node.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            if(fast == null){
                fast = head;
            }
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        dummy = slow.next;
        slow.next = null;
        return dummy;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
