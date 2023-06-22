package org.example.addstrings;

/* References:
 * https://leetcode.com/problems/add-strings/
 * https://www.youtube.com/watch?v=KUs7nZj_ths&feature=youtu.be
 * https://leetcode.com/problems/add-strings/discuss/968047/Simple-JAVA
 */
/*
123
 17
---
140
 */
public class Solution {
    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {
        String ans = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0)
                sum = sum + num1.charAt(i--) - '0';
            if (j >= 0)
                sum = sum + num2.charAt(j--) - '0';
            sum = sum + carry;
            carry = sum / 10;
            int currentDigit = sum % 10;
            ans = currentDigit + ans;
        }
        if (carry > 0)
            ans = carry + ans;
        return ans;
    }

    public String addStrings2(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0)
                sum = sum + num1.charAt(i--) - '0';
            if (j >= 0)
                sum = sum + num2.charAt(j--) - '0';
            sum = sum + carry;
            carry = sum / 10;
            int currentDigit = sum % 10;
            ans.insert(0, currentDigit);
        }
        if (carry > 0)
            ans.insert(0, carry);
        return ans.toString();
    }


    public String addStrings3(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int n1L = num1.length();
        int n2L = num2.length();
        int maxLength = Math.max(n1L, n2L);
        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            int curN1Idx = n1L - 1 - i;
            int curN2Idx = n2L - 1 - i;
            int curN1Val = curN1Idx >= 0 ? num1.charAt(curN1Idx) - '0' : 0;
            int curN2Val = curN2Idx >= 0 ? num1.charAt(curN2Idx) - '0' : 0;
            int sum = curN1Val + curN2Val + carry;
            ans.append(sum % 10);
            // Can be raplaced with carry = sum / 10;
            // or carry = Math.max(sum / 10, 0);
            carry = sum / 10 > 0 ? sum / 10 : 0;
        }
        ans = carry > 0 ? ans.append(carry) : ans;
        return ans.reverse().toString();
    }

    // not working see other solutions above
    public String addStrings4(String num1, String num2) {
//        String ans = "";
        StringBuilder ans = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0)
                sum = sum + num1.charAt(i--) - '0';
            if (j >= 0)
                sum = sum + num2.charAt(j--) - '0';
            sum = sum + carry;
            carry = sum / 10;
            int currentDigit = sum % 10;
//            ans = currentDigit +ans;
            if(!ans.toString().equals("")) {
                int temp = currentDigit + Integer.parseInt(ans.toString());
                ans.append(temp);
            } else if(currentDigit != 0) {
                ans.append(currentDigit);
            }
        }
        if (carry > 0) {
//            ans = carry + ans;
            int temp2 = carry + Integer.parseInt(ans.toString());
            if(!ans.toString().equals("")) {
                ans.append(carry + ans.toString());
            } else if(carry != 0) {
                ans.append(carry);
            }
//        return ans;
        }
        return ans.toString();
    }
}
