package org.example.treenarytreepostorder;

import java.util.LinkedList;
import java.util.List;

/*
References:
https://leetcode.com/problems/n-ary-tree-postorder-traversal/
https://www.youtube.com/watch?v=Ds5e1A88j7Q&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=7
 */
public class Solution {
    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if (root == null) {
            return outputArr;
        }

        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            outputArr.addFirst(node.val);

            for(Node child : node.children) {
                stack.add(child);
            }
        }

        return outputArr;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
