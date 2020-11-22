package org.example;

import org.example.bubblesort.BubbleSort1;
import org.example.insertionsort.InsertionSort1;
import org.example.mergesort.MergeSort1;
import org.example.mergesort.MergeSort2;
import org.example.mergesort.MergeSort3;
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
        System.out.println("Insertion Sort Start");
        InsertionSort1.insertionSort1_2(arr);
        printArray(arr);
        arr = new int[]{64, 25, 12, 22, 11};
        printArray(arr);
        System.out.println("Insertion Sort End");
        /*--------------------------------*/
        System.out.println("Merge Sort Start");
        printArray(MergeSort1.mergeSort1(arr, arr.length));
//        MergeSort2.mergeSort2(arr, arr.length);
//        MergeSort3.sort(arr,0, arr.length-1);
        printArray(arr);
        arr = new int[]{64, 25, 12, 22, 11};
        printArray(arr);
        System.out.println("Merge Sort End");
        /*--------------------------------*/
        System.out.println("Bubble Sort Start");
        BubbleSort1.bubbleSort1(arr);
        printArray(arr);
        arr = new int[]{64, 25, 12, 22, 11};
        printArray(arr);
        System.out.println("Bubble Sort End");
        /*--------------------------------*/
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
