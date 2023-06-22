package org.example.addtwonumbers.addtwonumbersolution1;

/*
NOT WORKING WIP
References:
https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.addTwoNumbers(null, null);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        if (l1 == null || l2 == null) {
            return result;
        }

        int remainder = 0;
        while (l1 != null && l2 != null) {

            int sum = l1.val + l2.val + remainder;

            if (sum % 10 == 0) {
                remainder += (sum / 10);
                sum = 0;
            } else {
                remainder = 0;
            }

            if (result == null) {
                result = new ListNode(sum, new ListNode());
            } else {
                //ListNode temp = new ListNode(sum, new ListNode());

                result.next = new ListNode(sum, new ListNode());

                result = result.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return result;
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
