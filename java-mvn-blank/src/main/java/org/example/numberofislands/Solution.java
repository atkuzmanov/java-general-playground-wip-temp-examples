package org.example.numberofislands;

/*
References:
https://leetcode.com/problems/number-of-islands/
https://www.youtube.com/watch?v=U6-X_QOwPcs&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=1&t=0s
 */

public class Solution {
    public static void main(String[] args) {

    }

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }

        return count;
    }

    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        callBFS(grid, i + 1, j); // down
        callBFS(grid, i - 1, j); // up
        callBFS(grid, i, j - 1); // left
        callBFS(grid, i, j + 1); // right
    }
}
