package org.example.selectionsort;

public class SelectionSort1 {
    public static int[] selectionSort1(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++) {
            int minI = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            if (minI != i) {
                int temp = arr[minI];
                arr[minI] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
