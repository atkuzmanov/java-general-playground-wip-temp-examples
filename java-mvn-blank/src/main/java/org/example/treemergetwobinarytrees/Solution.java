package org.example.treemergetwobinarytrees;

/*
 * References:
 * https://leetcode.com/problems/merge-two-binary-trees/
 * https://www.youtube.com/watch?v=_LJO5nBKC1A&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=10
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }

        if (t2 == null) {
            return t1;
        }

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
