package org.example.insertionsort;

/**
 * References:
 * https://www.geeksforgeeks.org/insertion-sort/
 * https://www.w3resource.com/java-exercises/sorting/java-sorting-algorithm-exercise-7.php
 * https://www.javatpoint.com/insertion-sort-in-java
 * https://www.baeldung.com/java-insertion-sort
 * https://stackabuse.com/insertion-sort-in-java/
 * https://www.programiz.com/dsa/insertion-sort
 * https://www.softwaretestinghelp.com/insertion-sort-in-java/
 * https://www.guru99.com/insertion-sort-java.html
 */
public class InsertionSort1 {

    /**
     * References:
     * https://www.youtube.com/watch?v=JU767SDMDvA
     * Not quite working?
     * Working in reverse?
     * @param arr
     */
    public static void insertionSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] < arr[i]) {
                int smallerNumber = arr[i];
                arr[i] = arr[j - 1];
                arr[j - 1] = smallerNumber;
                j = j - 1;
            }
        }
    }

    /**
     * References:
     * https://www.youtube.com/watch?v=JU767SDMDvA
     * Better, fixed.
     * @param arr
     */
    public static void insertionSort1_2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int smallerNumber = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = smallerNumber;
                j = j - 1;
            }
        }
    }

    /**
     * References:
     * https://www.w3resource.com/java-exercises/sorting/java-sorting-algorithm-exercise-7.php
     * @param arr
     */
    public static void insertionSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }
}
