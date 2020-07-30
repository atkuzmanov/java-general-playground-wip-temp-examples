package com.example.example1;

/*
reference: https://www.dummies.com/programming/java/what-is-recursion-in-java-programming/
 */

public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }

    public static long factorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
