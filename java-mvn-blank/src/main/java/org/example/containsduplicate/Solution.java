package org.example.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;

/*
References:
https://leetcode.com/problems/contains-duplicate/
https://www.youtube.com/watch?v=4oZsPXG9B94&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=3
 */
public class Solution {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) { // O(n) space and time
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums); //  nlog(n)

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

}
