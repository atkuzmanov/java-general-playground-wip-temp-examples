package org.example.selectionsort;

public class SelectionSort1 {

    /**
     * References:
     * https://www.youtube.com/watch?v=g-PGLbMth_g
     * https://www.javatpoint.com/selection-sort-in-java
     *
     * @param arr
     * @return
     */
    public static int[] selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            if (minI != i) {
                int smallerNumber = arr[minI];
                arr[minI] = arr[i];
                arr[i] = smallerNumber;
            }
        }
        return arr;
    }

    /**
     * References:
     * https://www.geeksforgeeks.org/selection-sort/
     *
     * @param arr
     */
    public static void selectionSort2(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * References:
     * https://www.javatpoint.com/selection-sort-in-java
     *
     * @param arr
     */
    public static void selectionSort3(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
