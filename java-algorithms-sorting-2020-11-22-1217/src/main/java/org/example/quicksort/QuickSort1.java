package org.example.quicksort;

/**
 * References:
 * https://www.geeksforgeeks.org/quick-sort/
 * https://www.youtube.com/watch?v=Hoixgm4-P4M
 */
public class QuickSort1 {

    public static void quickSort1(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition1(arr, low, high);

            quickSort1(arr, low, partitionIndex - 1);
            quickSort1(arr, partitionIndex + 1, high);
        }
    }

    static int partition1(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;


        return i + 1;
    }
}
