package org.example;

import org.example.selectionsort.SelectionSort1;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr = {64,25,12,22,11};

        /*--------------------------------*/
        int[] sorted1 =  SelectionSort1.selectionSort1(arr);
        printArray(sorted1);
        /*--------------------------------*/
        
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
