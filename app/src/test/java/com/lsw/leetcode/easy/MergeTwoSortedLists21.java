package com.lsw.leetcode.easy;


import org.junit.Test;

/**
 * Created by sweeneyliu on 2019/3/6.
 */
public class MergeTwoSortedLists21 {

    @Test
    public void test(){
            ListNode listNode10 = new ListNode(1);
            ListNode listNode11 = new ListNode(2);
            ListNode listNode12 = new ListNode(4);
            listNode10.next = listNode11;
            listNode11.next = listNode12;

            ListNode listNode20 = new ListNode(1);
            ListNode listNode21 = new ListNode(3);
            ListNode listNode22 = new ListNode(4);
            listNode20.next = listNode21;
            listNode21.next = listNode22;

//            ListNode node = mergeTwoLists(listNode10,listNode20);
        ListNode node = mergeTwoLists2(listNode10,listNode20);

            while(node!=null){
                System.out.println(node.val);
                node = node.next;
            }
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

    //采用递归方法
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val<l2.val){
            l1.next = mergeTwoLists2(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists2(l1,l2.next);
            return l2;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
