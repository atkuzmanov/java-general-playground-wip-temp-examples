package org.example.transposematrix;

/*
References:
https://leetcode.com/problems/transpose-matrix/
https://www.youtube.com/watch?v=VDw9y6nX_ss&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=65
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;

        int[][] newMatrix = new int[columns][rows];

        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j < columns; j++) {
                newMatrix[j][i] = A[i][j];
            }
        }

        return newMatrix;
    }
}