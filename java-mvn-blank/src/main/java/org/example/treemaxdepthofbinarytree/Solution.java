package org.example.treemaxdepthofbinarytree;

/*
 * References:
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * https://www.youtube.com/watch?v=MARxXuqnVGw&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=14
 */
public class Solution {
    public static void main(String[] args) {

    }

    public int maxDepth0(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftDepth = maxDepth0(root.left);
        int rightDepth = maxDepth0(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    // not working
    public int maxDepth1(TreeNode root, int depth) {
        int answer = 0;

        if(root == null) {
            return answer;
        }

        if(root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }

        maxDepth1(root.left, depth + 1);
        maxDepth1(root.right, depth + 1);

        return answer;
    }


    int answer = 0;
    public void maxDepth2(TreeNode root, int depth) {
//        int answer = 0;

        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }

        maxDepth1(root.left, depth + 1);
        maxDepth1(root.right, depth + 1);
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
