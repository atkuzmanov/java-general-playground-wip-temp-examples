package org.example;

import java.util.Scanner;
import java.util.Stack;

/**
 * {[()]}
 * {[(])}
 * {{[[(())]]}}
 * {}()
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(String bracketsStr) {
        if (bracketsStr.length() % 2 != 0) {
            return false;
        }

        char[] bracketsArr = bracketsStr.toCharArray();
        char top = 0;
        Stack<Character> stack = new Stack<>();

        for (char a : bracketsArr) {
            if (!stack.isEmpty()) {
                top = stack.peek();
            }
            stack.push(a);

            if (!stack.isEmpty() && stack.size() > 1) {
                if (top == '[' && stack.peek() == ']' ||
                        top == '(' && stack.peek() == ')' ||
                        top == '{' && stack.peek() == '}') {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
