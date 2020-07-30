package com.example.example4;

/*
Reference: https://codereview.stackexchange.com/questions/169800/stack-implementation-using-nodes
 */

public class Node<T> {
    T data;
    Node<T> previous;

    public Node(T data, Node<T> previous) {
        this.data = data;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public Node<T> getPrevious() {
        return previous;
    }
}

