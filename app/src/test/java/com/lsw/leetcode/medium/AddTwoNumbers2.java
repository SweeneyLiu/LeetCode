package com.lsw.leetcode.medium;

import org.junit.Test;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * Created by sweeneyliu on 2019/3/5.
 */
public class AddTwoNumbers2 {
    @Test
    public void test(){
        ListNode listNode10 = new ListNode(2);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(3);
        listNode10.next = listNode11;
        listNode11.next = listNode12;

        ListNode listNode20 = new ListNode(5);
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(4);
        listNode20.next = listNode21;
        listNode21.next = listNode22;

        ListNode node = addTwoNumbers(listNode10,listNode20);

        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(sum%10);
            sum /=10;
            cur = cur.next;
        }
        if(sum > 0){
            cur.next = new ListNode(sum);
        }
        return listNode.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
