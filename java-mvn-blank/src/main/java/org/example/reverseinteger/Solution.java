package org.example.reverseinteger;

/* References:
 * https://leetcode.com/problems/reverse-integer/
 * https://www.youtube.com/watch?v=CRgXG1vK-wg&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=13
 */
public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int pop = 0;

        while (x != 0) {
            // 123 % 10 = 12 with remainder 3, so we take (pop) the last number 3
            pop = x % 10;

            // 123 / 10 = 12
            x /= 10; // x = x / 10;

            if (reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10
                    && pop > 7) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MIN_VALUE / 10
                    && pop < -8) {
                return 0;
            }

            reversed = (reversed * 10) + pop;
        }

        return reversed;
    }
}
