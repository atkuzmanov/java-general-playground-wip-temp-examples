package org.example.reverselinkedlist;

/*
References:
https://leetcode.com/problems/reverse-linked-list/
https://www.youtube.com/watch?v=NCilGMhdYPY&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=4&t=3s
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
