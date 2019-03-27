package com.lsw.leetcode.medium;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/14.
 */
public class SortList148 {

    @Test
    public void test(){
        ListNode listNode10 = new ListNode(1);
        ListNode listNode11 = new ListNode(3);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(5);
        ListNode listNode14 = new ListNode(4);
        listNode10.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = listNode14;

        ListNode node = sortList(listNode10);

        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head, pre = null;
        //注意，这里不能写成while (fast.next != null && fast.next.next != null)，因为，在只有两个node的情况下fast和slow指针还是需要向下走，否则无法分解成一个node.
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //note: 这里需要一个pre指针来保存slow的上一个node，因为需要把上一个node的next设为null.
        pre.next = null;
        //merge的时候，参数是两个sort好的linkedlist的head，需要使用sortList的返回值。
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return mergeTwoLists(l1,l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) return l1;
        ListNode node = new ListNode(0);
        ListNode currentNode = node;
        while (l1 != null && l2 != null) {
            if(l1.val<l2.val){
                currentNode.next = new ListNode(l1.val);
                l1=l1.next;
            }else{
                currentNode.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if(l1 !=null){
            currentNode.next = l1;
        }
        if(l2 != null){
            currentNode.next = l2;
        }
        return node.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
