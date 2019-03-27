package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/15.
 */
public class RemoveDuplicatesfromSortedList83 {
    @Test
    public void test(){
        ListNode listNode10 = new ListNode(1);
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);
        ListNode listNode14 = new ListNode(4);
        listNode10.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;


//            ListNode node = mergeTwoLists(listNode10,listNode20);
        ListNode node = deleteDuplicates(listNode10);

        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
