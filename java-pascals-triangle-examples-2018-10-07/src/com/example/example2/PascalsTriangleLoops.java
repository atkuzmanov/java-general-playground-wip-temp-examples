package com.example.example2;

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

Pascal's triangle using loops
We will first see how to generate a (unformatted ) Pascal's triangle using simple looping statements. We maintain two int arrays, named currentRow and previousRow. Initially, previousRow would be initialised with { 1 } - the contents of the first row of the Pascal's triangle. After that, we have a loop whose loop counter, i runs from 2 to n where n is the number of rows that we wish to display. At any iteration, I represents the row number that we are printing. The currentRow will be initialised with an array of i (the loop counter) elements with the first and the last element of the array set to '1'. Next, we have an inner loop whose task is to compute the elements of currentRow. To do so, the loop counter, j runs from 0 to i-3. The numbers in the array previousRow at indices j and j+1 are added and the result is stored at the index j+1 of currentRow. When the inner loop exits, currentRow would be populated. The values stored in currentRow are printed and previousRow is assigned with currentRow so that it can be used in the next iteration of the outer loop.

Given below is a complete program which takes an input n from the user and prints the first n lines of the Pascal's triangle.
 */

import java.util.Scanner;

public class PascalsTriangleLoops {

    public static void print(int n) {
        int[] previousRow;
        int[] currentRow = {1};
        printArray(currentRow);
        previousRow = currentRow;
        for (int i = 2; i <= n; i++) {
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i - 1] = 1;
            for (int j = 0; j <= i - 3; j++) {
                currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
            }
            printArray(currentRow);
            previousRow = currentRow;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
        int row = scanner.nextInt();
        print(row);
    }
}