package com.example.example4;

/*
reference: https://introcs.cs.princeton.edu/java/23recursion/
reference:
 */

/*
Dynamic programming. A general approach to implementing recursive programs, The basic idea of dynamic programming is to recursively divide a complex problem into a number of simpler subproblems; store the answer to each of these subproblems; and, ultimately, use the stored answers to solve the original problem. By solving each subproblem only once (instead of over and over), this technique avoids a potential exponential blow-up in the running time.

Bottom-up dynamic programming. In bottom-up dynamic programming, we compute solutions to all of the subproblems, starting with the “simplest” subproblems and gradually building up solutions to more and more complicated subproblems.
 */



/******************************************************************************
 *  Compilation:  javac BottomUpFibonacci.java
 *  Execution:    java BottomUpFibonacci n
 *
 *  Computes and prints the first n Fibonacci numbers.
 *  This program uses bottom-up dynamic programming.
 *
 *   % java BottomUpFibonacci 7
 *   1: 1
 *   2: 1
 *   3: 2
 *   4: 3
 *   5: 5
 *   6: 8
 *   7: 13
 *
 *   Remark: The 93rd Fibonacci number would overflow a long.
 *
 ******************************************************************************/

public class DynamicProgrammingBottomUpFibonacci {

    public static long fibonacci(int n) {
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
        int n = 7;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }

}
