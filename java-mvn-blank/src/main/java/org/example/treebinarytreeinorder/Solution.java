package org.example.treebinarytreeinorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
References:
https://leetcode.com/problems/binary-tree-inorder-traversal/
https://www.youtube.com/watch?v=WZwNoTm_9d8&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=8
 */
public class Solution {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> outputArray = new ArrayList<>();

        if (root == null) {
            return outputArray;
        }

        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            outputArray.add(current.val);
            current = current.right;
        }

        return outputArray;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
