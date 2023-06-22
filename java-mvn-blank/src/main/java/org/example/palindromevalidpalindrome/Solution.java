package org.example.palindromevalidpalindrome;

/* References:
 * https://leetcode.com/problems/valid-palindrome/
 * https://www.youtube.com/watch?v=rYyn9Vc-dBQ&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=24
 */
public class Solution {
    public boolean isPalindrome(String s) {
        String fixedString = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedString += c;
            }
        }

        fixedString = fixedString.toLowerCase();

        int aPointer = 0;
        int bPointer = fixedString.length() - 1;

        while (aPointer <= bPointer) {
            if(fixedString.charAt(aPointer) != fixedString.charAt(bPointer)) {
                return false;
            }
            aPointer += 1;
            bPointer -= 1;
        }
        return true;
    }
}
