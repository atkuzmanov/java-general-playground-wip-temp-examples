package com.minesweeper.example.one;

import java.util.Random;

public class Minesweeper {

    private static final int ROWS = 7;
    private static final int COLS = 7;
    private static final int MINES = 5;
    private static final int MINES_COORS[][] = new int[MINES][2];
    private static char[][] realBoard = new char[ROWS][COLS];
    private static char[][] playerBoard = new char[ROWS][COLS];

    private static boolean isMine(int row, int col, char[][] board) {
        if (board[row][col] == '*')
            return (true);
        else
            return (false);
    }

    private static boolean isValid(int row, int col) {
        // Returns true if row number and column number is in range.
        return (row >= 0) && (row < ROWS) &&
                (col >= 0) && (col < COLS);
    }

    // A Function to initialise the game.
    private static void initialise() {
        // Assign all the cells as mine-free.
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                playerBoard[i][j] = realBoard[i][j] = '-';
            }
        }
    }

    private static void printBoard(char[][] board) {
        int i, j = 0;

        System.out.print("  ");

        for (i = 0; i < ROWS; i++) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        for (i = 0; i < ROWS; i++) {
            System.out.print(" " + i);

            for (j = 0; j < COLS; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    private static int getRandNum(int min, int range) {
        Random r = new Random();
        return r.nextInt(range + 1) + min;
    }

    private static void placeRandomMines() {
        boolean[] marked = new boolean[ROWS * COLS];

        for (int i = 0; i < MINES; ) {
            int random = getRandNum(0, ROWS * COLS);
            int x = random / ROWS;
            int y = random % COLS;

            if (marked[random] == false) {
                // Row Index of the Mine.
                MINES_COORS[i][0]= x;
                // Column Index of the Mine.
                MINES_COORS[i][1] = y;
                // Place the mine
                realBoard[x][y] = '*';
                marked[random] = true;
                i++;
            }
        }

    }

    public static void main(String[] args) {
        initialise();
        printBoard(playerBoard);
        placeRandomMines();
        printBoard(realBoard);

//        for(int i = 0; i < 10; i++) {
//            System.out.println(getRandNum(0, 7) % (ROWS * COLS));
//        }
    }
}
