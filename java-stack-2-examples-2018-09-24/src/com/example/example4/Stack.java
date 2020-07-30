package com.example.example4;

/*
Reference: https://codereview.stackexchange.com/questions/169800/stack-implementation-using-nodes

Comments:

Users often know, how many items there are on a stack – but not always! See graph searching algorithms for example. How do you imagine retrieving all the nodes from a stack with no indication of stack emptiness? That would force users to enclose every peek() and pop() within try-catch instructions. You should definitely return null instead of throwing exceptions, or add some isEmpty() or isNonEmpty() testing method to the Stack class. – CiaPan Jul 21 '17 at 5:33

---

Don't throw RuntimeException: they are not specific, and hence difficult to catch. (Otherwise, you might as well drop the null checks and let it fail naturally with NullPointerException, which is also a kind of RuntimeException.) You should make your own exception subclass, or use java.util.NoSuchElementException.

It would also make sense to support an isEmpty() method, to give the user a fair chance to avoid the exception.

Two spaces per level of indentation is too narrow and unconventional for my taste, and could also encourage excessive nesting. Four or eight spaces would be acceptable.

shareimprove this answer
answered Jul 21 '17 at 1:14

200_success

---
 */

public class Stack<T> {
    Node<T> head = null;

    public Stack() {
    }

    public T peek() {
        if (this.head == null) {
            throw new RuntimeException("Unable to peek element for an empty stack");
        }

        return this.head.getData();
    }

    public void push(T data) {
        this.head = new Node<>(data, this.head);
    }

    public void pop() {
        if (this.head == null) {
            throw new RuntimeException("Unable to remove element from an empty stack");
        }

        this.head = this.head.getPrevious();
    }
}