package com.java.general.playground.expressiontree.exptree0;

import java.util.Arrays;

/**
 * 2 x 3 + 5
 *
 * NOT WORKING
 *
 * References:
 * https://www.sanfoundry.com/java-program-implement-expression-tree-algorithm/
 * https://www.geeksforgeeks.org/expression-tree/
 * https://www.geeksforgeeks.org/evaluation-of-expression-tree/
 * http://cogitolearning.co.uk/2013/05/writing-a-parser-in-java-the-expression-tree/
 * http://www.cs.utoronto.ca/~dianeh/148/handbook/sample/source/csc148/a3/ExpressionTree.java
 * https://rosettacode.org/wiki/Arithmetic_evaluation#Java
 * https://stackoverflow.com/questions/27302277/recursive-evaluate-in-expression-tree-class
 * https://stackoverflow.com/questions/36585708/evaluating-an-expression-in-a-binary-tree-java
 * http://web.cs.iastate.edu/~xqhuang/cs228/2010Fall/ExpressionTree.java
 *
 */
public class ExpressionTree0 {
//    public static void main(String[] args) {
//
//        Node1 n = new Node1();
//
//        char[] expression = processResult(n);
//    }
//
//
//    static public int doCalc(char[] arr) {
//
//        int num = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(i % 2 == 0) {
//                num = Integer.valueOf(arr[i] + "");
//            } else {
//                switch(arr[i]) {
//                    case '*':
//                        return num * arr[i+1];
//                    case '+':
//                        return num + arr[i+1];
//                }
//            }
//        }
//
//        return num;
//    }
//
//
//    //    public char processResult(Node current, Node leftChild, Node rightChild) {
//    static public char[] processResult(Node1 current, char[] arr) {
//        char[] arrTemp = new char[100];
//
//        if(current == null) {
//            return arr;
//        }
//
//        arrTemp = Arrays.copyOf(processResult(current.leftChild, arr), 100);
//
//
//        arrTemp = Arrays.copyOf(processResult(current, arr), 100);
//
//        arrTemp = Arrays.copyOf(processResult(current.rightChild, arr), 100);
//
//        return arrTemp;
//    }
}

class Node1 {
    public char val;

    public Node1 leftChild;
    public Node1 rightChild;
}

