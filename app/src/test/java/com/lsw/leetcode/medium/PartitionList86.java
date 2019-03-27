package com.lsw.leetcode.medium;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/15.
 */
public class PartitionList86 {

    @Test
    public void test(){
        ListNode listNode10 = new ListNode(1);
        ListNode listNode11 = new ListNode(6);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(5);
        ListNode listNode14 = new ListNode(4);
        listNode10.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;

        ListNode node = partition(listNode10,3);

        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    public ListNode partition(ListNode head, int x) {
        // 头结点
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        // 当前结点
        ListNode curr1 = dummy1;
        ListNode curr2 = dummy2;
        while (head != null) {
            if (head.val < x) {
                curr1.next = head;
                curr1 = head;
            } else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }
        // important! avoid cycle in linked list.
        // otherwise u will get TLE.
        curr2.next = null;
        curr1.next = dummy2.next;
        return dummy1.next;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
