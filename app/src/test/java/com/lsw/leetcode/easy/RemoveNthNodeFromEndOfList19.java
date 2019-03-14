package com.lsw.leetcode.easy;

import org.junit.Test;

import java.util.List;

/**
 * Created by sweeneyliu on 2019/3/14.
 */
public class RemoveNthNodeFromEndOfList19 {

    @Test
    public void test(){
        ListNode listNode10 = new ListNode(1);
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(3);
        ListNode listNode13 = new ListNode(4);
        ListNode listNode14 = new ListNode(5);
        listNode10.next = listNode11;
//        listNode11.next = listNode12;
//        listNode12.next = listNode13;
//        listNode13.next = listNode14;

        ListNode node = removeNthFromEnd(listNode10,2);
        while(node !=null){
            System.out.print(node.val);
            node = node.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        ListNode fast = head;
        //注意 我们要构建长度为 n + 1 的窗口 所以 i 从 0 开始
        for (int i = 0; i < n; i++) {
            //fast 指针指向倒数第一个节点的时候，就是要删除头节点
            if (fast == null) {
                return head;
            } else {
                fast = fast.next;
            }
        }
        // 由于 n = len 再循环内部没有判断直接前进了一个节点，临界值 n = len 的时候 循环完成或 fast = null
        if (fast == null){
            return head.next;
        }
        //此时 n 一定是小于 len 的 且 fast 先走了 n 步
        ListNode pre = head;
        while (fast.next != null) {
            fast = fast.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
