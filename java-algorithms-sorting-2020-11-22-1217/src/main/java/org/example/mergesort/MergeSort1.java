package org.example.mergesort;

/**
 * Was not working.
 * Fixed.
 */
public class MergeSort1 {

    public static int[] mergeSort1(int[] arr, int size) {
        if (size == 1) {
            return arr;
        }

        int mid = size / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < size; i++) {
            rightArr[i - mid] = arr[i];
        }

        int[] arrLeft = mergeSort1(leftArr, mid);
        int[] arrRight = mergeSort1(rightArr, size - mid);


        return merge1(arrLeft, arrRight, mid, size - mid);
    }

    private static int[] merge1(int[] arrLeft, int[] arrRight, int leftSize, int rightSize) {
        int[] arr3 = new int[arrLeft.length + arrRight.length];

        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (arrLeft[l] < arrRight[r]) {
                arr3[i] = arrLeft[l];
                i++;
                l++;
            } else {
                arr3[i] = arrRight[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            arr3[i++] = arrLeft[l++];
        }
        while (r < rightSize) {
            arr3[i++] = arrRight[r++];
        }

        return arr3;
    }
}
