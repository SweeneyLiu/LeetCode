package com.lsw.leetcode.easy;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/8.
 */
public class ReverseLinkedListI206 {
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

       ListNode node = reverseList(listNode10);
       while(node !=null){
           System.out.print(node.val);
           node = node.next;
       }
    }

    public ListNode reverseList(ListNode head) {
//        if(head == null) return null;
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode next = head.next;
//        while(cur != null){
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//            if(cur != null){
//                next = cur.next;
//            }
//        }
//        return pre;

        if(head == null){
            return null;
        }

        ListNode pre = null;
        ListNode cur = head;
        ListNode tmpNode = null;

        while(cur != null){
            tmpNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmpNode;
        }
        return pre;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
