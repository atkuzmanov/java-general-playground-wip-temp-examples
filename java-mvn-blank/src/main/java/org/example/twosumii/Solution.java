package org.example.twosumii;

/*
References:
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
https://www.youtube.com/watch?v=sAQT4ZrUfWo&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=5
 */
public class Solution {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length - 1;

        while (aPointer <= bPointer) {
            int sum = numbers[aPointer] + numbers[bPointer];

            if(sum > target) {
                bPointer -= 1;
            } else if( sum < target) {
                aPointer += 1;
            } else {
                return new int[] {aPointer +1, bPointer +1};
            }
        }

        return new int[] {aPointer + 1, bPointer + 1};
    }
}
