package com.example.example4;

/*
reference: https://introcs.cs.princeton.edu/java/23recursion/TopDownFibonacci.java.html
reference: https://introcs.cs.princeton.edu/java/23recursion/
 */

/*
Dynamic programming. A general approach to implementing recursive programs, The basic idea of dynamic programming is to recursively divide a complex problem into a number of simpler subproblems; store the answer to each of these subproblems; and, ultimately, use the stored answers to solve the original problem. By solving each subproblem only once (instead of over and over), this technique avoids a potential exponential blow-up in the running time.

Top-down dynamic programming. In top-down dynamic programming, we store or cache the result of each subproblem that we solve, so that the next time we need to solve the same subproblem, we can use the cached values instead of solving the subproblem from scratch.
 */

/******************************************************************************
 *  Compilation:  javac TopDownFibonacci.java
 *  Execution:    java TopDownFibonacci n
 *
 *  Computes and prints the first n Fibonacci numbers.
 *  This program uses top-down dynamic programming.
 *
 *   % java TopDownFibonacci 7
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

public class DynamicProgrammingTopDownFibonacci {
    private static long[] f = new long[92];

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        // return cached value (if previously computed)
        if (f[n] > 0) return f[n];

        // compute and cache value
        f[n] = fibonacci(n-1) + fibonacci(n-2);
        return f[n];
    }

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
        int n = 7;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }

}