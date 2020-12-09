import java.io.*;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

// Main class should be named 'Solution'
// input 2 collections
// sorted
// integer
// produce a new collection which is sorted
// with all elements

//1 3 5 8 12 32
// 2 4 43 52

//1 2 3 4 5 8 12 32 43 52

//====================

//10 12 13
//11 17 18 23 24 25

// 10 11 12 13 17 18 23 24 25


class Solution {
    public static void main(String[] args) {
        int[] input1 = new int[] {1, 3, 5, 8, 12, 32};
        int[] input2 = new int[] {2, 4, 43, 52};
        int input1Size = 0;
        input1Size = input1.length;
        int input2Size = 0;
        input2Size = input2.length;

        System.out.println(Arrays.toString(merge(input1, input2, input1Size, input2Size)));
    }

    private static int[] mergeSort(final int arr, final int size){
        int[] result = new int[]{};
        return result;
    }

    private synchronized static int[] merge(final int[] arrLeft, final int[] arrRight, final int arrLeftSize, final int arrRightSize) {
        // if(arrLeftSize == 0 )
        if(arrRight == null) {
            arrRight =  new int[arrRight];
        }
        if(arrLeft == null) {
            arrLeft =  new int[arrLeft];
        }

        int[] result = new int[arrLeftSize + arrRightSize];

        int i = 0, left = 0, right = 0;
        while(left < arrLeftSize && right < arrRightSize) {
            if(arrLeft[left] < arrRight[right]) {
                result[i++] = arrLeft[left++];
            } else {
                result[i++] = arrRight[right++];
            }
        }
        while(left < arrLeftSize) {
            result[i++] = arrLeft[left++];
        }
        while(right < arrRightSize) {
            result[i++] = arrRight[right++];
        }
        return result;
    }
}
