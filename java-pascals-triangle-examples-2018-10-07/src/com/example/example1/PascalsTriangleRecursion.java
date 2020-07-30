package com.example.example1;

/*
reference: http://www.javawithus.com/programs/pascal-triangle
 */

/*


Pascal's Triangle
This article intends to show the different ways to print a Pascal's triangle and also format it so that it looks like an isosceles triangle.

Understanding how a Pascal's triangle is built would be easier by considering the following figure which shows the first six rows of the Pascal's triangle.

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Each row begins and ends with the number one. The remaining numbers are obtained by summing the two numbers that lie directly above that number on the previous row and the number that follows it. So, in order to find the numbers in the nth row of the triangle, we need the values of the (n-1) the row. Let's say that we have computed the fourth row - 1 3 3 1. Now, the fifth row has five elements. The first and the last element would be one. The remaining elements would be (1+3), (3+3), (3+1) = 4, 6, 4. So, the complete fifth row would be 1 4 6 4 1.

---

Generating Pascal's triangle using recursion
Since calculating the value of a particular position in the triangle uses previously calculated values, this problem can also be solved using recursion. The number at position row i and column j would be represented as pascal(i,j) with I and j starting from 0. There would be two base conditionswhich are related to the first and last elements, which are always one. These two conditions can be expressed as

pascal ( i, 0 ) = 1
pascal ( i, i ) = 1

Following is the recursive formula used to calculate the remaining elements :

pascal ( i, j ) = pascal ( i - 1 , j -1 ) + pascal ( i - 1 , j )

Given below is the program which uses the recursive definition of the Pascal's triangle
 */

import java.util.Scanner;

public class PascalsTriangleRecursion {

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
        int row = scanner.nextInt();
        print(row);
    }
}