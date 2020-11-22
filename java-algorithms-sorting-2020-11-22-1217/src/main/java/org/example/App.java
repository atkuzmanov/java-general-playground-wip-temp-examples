package org.example;

import org.example.selectionsort.SelectionSort1;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr = {64, 25, 12, 22, 11};

        /*--------------------------------*/
        System.out.println("Selection Sort Start");
        int[] sorted1 = SelectionSort1.selectionSort1(arr);
        printArray(sorted1);
        SelectionSort1.selectionSort2(arr);
        SelectionSort1.selectionSort3(arr);
        printArray(arr);
        arr = new int[]{64, 25, 12, 22, 11};
        printArray(arr);
        System.out.println("Selection Sort End");
        /*--------------------------------*/
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
