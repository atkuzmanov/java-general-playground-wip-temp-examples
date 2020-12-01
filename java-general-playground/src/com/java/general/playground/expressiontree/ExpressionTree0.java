package com.java.general.playground.expressiontree;

import java.util.Arrays;

/**
 * 2 x 3 + 5
 */

public class ExpressionTree0 {
    public static void main(String[] args) {

        Node n = new Node();

        char[] expression = processResult(n);
    }


    static public int doCalc(char[] arr) {

        int num = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                num = Integer.valueOf(arr[i] + "");
            } else {
                switch(arr[i]) {
                    case '*':
                        return num * arr[i+1];
                    case '+':
                        return num + arr[i+1];
                }
            }
        }

        return num;
    }


    //    public char processResult(Node current, Node leftChild, Node rightChild) {
    static public char[] processResult(Node current, char[] arr) {
        char[] arrTemp = new char[100];

        if(current == null) {
            return arr;
        }

        arrTemp = Arrays.copyOf(processResult(current.leftChild, arr), 100);


        arrTemp = Arrays.copyOf(processResult(current, arr), 100);

        arrTemp = Arrays.copyOf(processResult(current.rightChild, arr), 100);

        return arrTemp;
    }
}

class Node {
    public char val;

    public Node leftChild;
    public Node rightChild;
}

