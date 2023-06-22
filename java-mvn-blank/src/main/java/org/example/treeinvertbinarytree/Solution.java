package org.example.treeinvertbinarytree;

import com.sun.source.tree.Tree;

/* References:
 * https://leetcode.com/problems/invert-binary-tree/
 * https://www.youtube.com/watch?v=fKgZiCXb6zs&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=11
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swap
        root.left = right;
        root.right = left;

        return root;
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
