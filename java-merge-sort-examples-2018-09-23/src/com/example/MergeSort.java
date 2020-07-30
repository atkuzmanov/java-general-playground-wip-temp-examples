package com.example;

/**
 * Reference: https://www.youtube.com/watch?v=9Qk1t66g7IU
 */

public class MergeSort {

    public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);

        System.out.println("Before sorting: ");
        printArray(A);

        A = mergeSort(A);

        System.out.println("\n\nAfter sorting: ");
        printArray(A);
    }

    public static int[] mergeSort(int[] B) {
        int[] result = new int[B.length];

        if (B.length <= 1) {
            return B;
        }

        int midpoint = B.length / 2;

        int left[] = new int[midpoint];
        int right[];

        if (B.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = B[i];
        }

        int x = 0;
        for (int j = midpoint; j < B.length; j++) {
            if (x < right.length) {
                right[x] = B[j];
                x++;
            }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);

        return result;

        /**
         * Shivam Malhotra
         3 years ago
         Another way to achieve the same thing
         int mid = arr.length/2;
         int[] left = new int[mid];
         int[] right = new int[arr.length-mid];﻿
         */
    }

    private static int[] merge(int[] left, int[] right) {
        int resultLength = left.length + right.length;
        int[] result = new int[resultLength];

        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;

        while (indexLeft < left.length || indexRight < right.length) {
            if (indexLeft < left.length && indexRight < right.length) {
                if (left[indexLeft] <= right[indexRight]) {
                    result[indexResult] = left[indexLeft];
                    indexLeft++;
                    indexResult++;
                } else {
                    result[indexResult] = right[indexRight];
                    indexRight++;
                    indexResult++;
                }
            } else if (indexLeft < left.length) {
                result[indexResult] = left[indexLeft];
                indexLeft++;
                indexResult++;
            } else if (indexRight < right.length) {
                result[indexResult] = right[indexRight];
                indexRight++;
                indexResult++;
            }
        }

        return result;
    }

    private static void populateArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
    }

    private static void printArray(int[] B) {
        // System.out.println("Array length: " + B.length);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
