package com.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution_3 {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }
        ListNode d = null;
        ListNode hnext = head.next;

        while(head != null){
            head.next = d;
            d = head;
            head = hnext;
            if(head != null){
                hnext = hnext.next;
            }
        }

        return d;
    }
}