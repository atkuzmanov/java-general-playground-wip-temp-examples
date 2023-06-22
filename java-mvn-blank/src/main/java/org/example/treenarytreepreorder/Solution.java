package org.example.treenarytreepreorder;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
References:
https://leetcode.com/problems/n-ary-tree-preorder-traversal/
https://www.youtube.com/watch?v=HOMjIiztImo&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=9
 */
public class Solution {
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if (root == null) {
            return outputArr;
        }

        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            outputArr.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }

        return outputArr;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
