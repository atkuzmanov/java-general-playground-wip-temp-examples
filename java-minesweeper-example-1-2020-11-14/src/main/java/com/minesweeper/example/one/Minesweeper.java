package com.minesweeper.example.one;

public class Minesweeper {

    static final int ROWS = 7;
    static final int COLS = 7;
    static char[][] realBoard = new char[ROWS][COLS];
    static char[][] playerBoard = new char[ROWS][COLS];

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

    private static void printPlayerBoard() {
        int i, j = 0;

        System.out.println("    ");

        for (i = 0; i < ROWS; i++) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        for (i = 0; i < ROWS; i++) {
            System.out.print(" " + i);

            for (j = 0; j < COLS; j++) {
                System.out.print(playerBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initialise();
        printPlayerBoard();
    }
}
