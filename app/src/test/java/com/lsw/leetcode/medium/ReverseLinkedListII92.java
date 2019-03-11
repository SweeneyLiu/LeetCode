package com.lsw.leetcode.medium;

import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/8.
 */
public class ReverseLinkedListII92 {

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

        ListNode node = reverseBetween(listNode10,2,4);
        while(node !=null){
            System.out.print(node.val);
            node = node.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        if(head==null||head.next==null)
            return dummy.next;

        ListNode startpoint = dummy;//startpoint指向需要开始reverse的前一个
        ListNode node1 = null;//需要reverse到后面去的节点
        ListNode node2 = null;//需要reverse到前面去的节点

        for (int i = 0; i < n; i++) {
            if (i < m-1){
                startpoint = startpoint.next;//找真正的startpoint
            } else if (i == m-1) {//开始第一轮
                node1 = startpoint.next;
                node2 = node1.next;
            }else {
                node1.next = node2.next;//node1交换到node2的后面
                node2.next = startpoint.next;//node2交换到最开始
                startpoint.next = node2;//node2作为新的点
                node2 = node1.next;//node2回归到node1的下一个，继续遍历
            }
        }
        return dummy.next;

//        if(head == null)return null;
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode pre = dummy;
//        ListNode start = head;
//        ListNode then = head.next;
//        for(int i = 0; i < m-1; i++){ //这是从0到m-1 按照顺序来显示：找m
//            pre = pre.next;
//            start = start.next;
//            then = then.next;
//        }
//        //  for(int i = m-1 ; i < n - m; i++){ 为什么要从0开始呢？ 难道不是从m就得来置换了吗？
//        for(int i = 0 ; i < n - m; i++){ //如果从m-1 开始，结果为132456.就换了一次。why？？？？:交换。
//            start.next = then.next;
//            then.next = pre.next;
//            pre.next = then;
//            then = start.next;
//        }
//        return dummy.next;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
