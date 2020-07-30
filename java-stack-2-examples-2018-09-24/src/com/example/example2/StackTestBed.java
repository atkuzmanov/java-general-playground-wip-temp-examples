package com.example.example2;

/*
    Reference: https://www.quora.com/Why-does-the-top-of-a-stack-have-an-index-of-1-and-not-0
 */

/*
Why does the top of a stack have an index of 1 and not 0?

Chandra Mohan, Full Time Java professional now!
Answered Mar 7, 2013 · Author has 229 answers and 507.2k answer views
If you are talking about the return value of search method, the javadoc mentions that it's the distance from the top of the stack.
Stack (Java 2 Platform SE v1.4.2)

Top of stack is the position where the new item is going to be inserted, so 1 based return value makes sense for value. If you use IndexOf to find the object in stack, you get the expected value of the index of the item.

public class StackTestBed {

    private static Stack<String> stack = new Stack<String>();

    public static void main(String[] args) {
        String toAdd = "abc";
        stack.push(toAdd);

        System.out.println(stack.indexOf(toAdd)); // Prints 0
        System.out.println(stack.search(toAdd)); // Prints 1
    }
}
 */


import java.util.Stack;

public class StackTestBed {

    private static Stack<String> stack = new Stack<String>();

    private static Stack<Integer> intStack = new Stack<Integer>();

    private static Stack<String> stringStack2 = new Stack<String>();

    public static void main(String[] args) {
        String toAdd = "abc";
        stack.push(toAdd);

        System.out.println(stack.indexOf(toAdd)); // Prints 0
        System.out.println(stack.search(toAdd)); // Prints 1
        System.out.println();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        System.out.println(intStack.indexOf(5)); // Prints
        System.out.println(intStack.search(5)); // Prints
        System.out.println();

        stringStack2.push("a");
        stringStack2.push("b");
        stringStack2.push("c");

        System.out.println("stringStack2: " + stringStack2);
        System.out.println();

        System.out.println("index of a: " + stringStack2.indexOf("a")); // Prints
        System.out.println("search a: " + stringStack2.search("a")); // Prints
        System.out.println();

        System.out.println("index of b: " + stringStack2.indexOf("b")); // Prints
        System.out.println("search b: " + stringStack2.search("b")); // Prints
        System.out.println();

        System.out.println("index of c: " + stringStack2.indexOf("c")); // Prints
        System.out.println("search c: " + stringStack2.search("c")); // Prints
    }
}
