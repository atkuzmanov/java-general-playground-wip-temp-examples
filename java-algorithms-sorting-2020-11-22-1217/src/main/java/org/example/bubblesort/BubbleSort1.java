package org.example.bubblesort;

/**
 * References:
 * https://www.w3resource.com/java-exercises/sorting/java-sorting-algorithm-exercise-2.php
 * https://www.geeksforgeeks.org/bubble-sort/
 * https://en.wikipedia.org/wiki/Bubble_sort
 * https://www.javatpoint.com/bubble-sort-in-java
 * https://stackabuse.com/bubble-sort-in-java/
 * https://www.baeldung.com/java-bubble-sort
 * https://beginnersbook.com/2014/07/java-program-for-bubble-sort-in-ascending-descending-order/
 * https://www.programiz.com/java-programming/examples/bubble-sort
 * https://www.softwaretestinghelp.com/bubble-sort-java/
 * https://www.educative.io/edpresso/what-is-a-bubble-sort-in-java
 */
public class BubbleSort1 {

    public static void bubbleSort1(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int biggerNumber = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = biggerNumber;
                }
            }
        }
    }
}
