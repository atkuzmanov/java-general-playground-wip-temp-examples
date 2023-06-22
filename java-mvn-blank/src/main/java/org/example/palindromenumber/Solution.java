package org.example.palindromenumber;

/* References:
 * https://leetcode.com/problems/palindrome-number/
 * https://www.youtube.com/watch?v=UPdSViixmDs&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=12
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversedInt = 0;
        while (x > reversedInt) {
            int pop = x % 10;
            x /= 10;

            reversedInt = (reversedInt * 10) + pop;
        }


        if (x == reversedInt || x == reversedInt / 10) {
            return true;
        } else {
            return false;
        }
    }
}
