package org.example.palindromelinkedlist;

/*
References:
https://leetcode.com/problems/palindrome-linked-list/
https://www.youtube.com/watch?v=wk4QsvwQwdQ&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=6
 */
public class Solution {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;


        }

        slow = reversed(slow);

        fast = head;


        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public ListNode reversed(ListNode head) {
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

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
