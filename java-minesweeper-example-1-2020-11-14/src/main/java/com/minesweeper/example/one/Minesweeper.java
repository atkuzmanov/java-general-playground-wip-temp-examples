package com.minesweeper.example.one;

import java.util.Random;

/**
 * References:
 * https://www.geeksforgeeks.org/cpp-implementation-minesweeper-game/
 */
public class Minesweeper {

    private static final int ROWS = 7;
    private static final int COLS = 7;
    private static final int MINES = 5;
    // Stores (x,y) coordinates of all mines.
    private static final int MINES_COORS[][] = new int[MINES][2];
    private static int MOVES_LEFT = ROWS * COLS - MINES;
    private static final int MOVES_COORS[][] = new int[MOVES_LEFT][2];
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
                MINES_COORS[i][0] = x;
                // Column Index of the Mine.
                MINES_COORS[i][1] = y;
                // Place the mine
                realBoard[x][y] = '*';
                marked[random] = true;
                i++;
            }
        }
    }

    private static void playRandomMoves() {
        boolean[] marked = new boolean[ROWS * COLS];

        for (int i = 0; i < MOVES_LEFT; ) {
            int random = getRandNum(0, ROWS * COLS);
            int x = random / ROWS;
            int y = random % COLS;

            if (!marked[random]) {
                // Row Index of the Mine.
                MOVES_COORS[i][0] = x;
                // Column Index of the Mine.
                MOVES_COORS[i][1] = y;
                // Place the mine
                realBoard[x][y] = '*';
                marked[random] = true;
                i++;
            }
        }
    }


    private static int[] makeAMove(int currentMoveIndex) {
        int result[] = new int[2];
        result[0] = MOVES_COORS[currentMoveIndex][0];
        result[1] = MOVES_COORS[currentMoveIndex][1];

        return result;
    }

    /*
        Count all the mines in the 8 adjacent
        cells

            N.W   N   N.E
              \   |   /
               \  |  /
            W----Cell----E
                 / | \
               /   |  \
            S.W    S   S.E

        Cell-->Current Cell (row, col)
        N -->  North        (row-1, col)
        S -->  South        (row+1, col)
        E -->  East         (row, col+1)
        W -->  West            (row, col-1)
        N.E--> North-East   (row-1, col+1)
        N.W--> North-West   (row-1, col-1)
        S.E--> South-East   (row+1, col+1)
        S.W--> South-West   (row+1, col-1)
     */
    private static int countAdjacentMines(int row, int col, char realBoard[][]) {
        int count = 0;

        //----------- 1st Neighbour (North) ------------
        // Only process this cell if this is a valid one
        if (isValid(row - 1, col)) {
            if (isMine(row - 1, col, realBoard)) {
                count++;
            }
        }
        //----------- 2nd Neighbour (South) ------------
        // Only process this cell if this is a valid one
        if (isValid(row + 1, col)) {
            if (isMine(row + 1, col, realBoard))
                count++;
        }
        //----------- 3rd Neighbour (East) ------------
        // Only process this cell if this is a valid one
        if (isValid(row, col + 1)) {
            if (isMine(row, col + 1, realBoard))
                count++;
        }
        //----------- 4th Neighbour (West) ------------
        // Only process this cell if this is a valid one
        if (isValid(row, col - 1)) {
            if (isMine(row, col - 1, realBoard))
                count++;
        }
        //----------- 5th Neighbour (North-East) ------------
        // Only process this cell if this is a valid one
        if (isValid(row - 1, col + 1)) {
            if (isMine(row - 1, col + 1, realBoard))
                count++;
        }
        //----------- 6th Neighbour (North-West) ------------
        // Only process this cell if this is a valid one
        if (isValid(row - 1, col - 1)) {
            if (isMine(row - 1, col - 1, realBoard))
                count++;
        }
        //----------- 7th Neighbour (South-East) ------------
        // Only process this cell if this is a valid one
        if (isValid(row + 1, col + 1)) {
            if (isMine(row + 1, col + 1, realBoard))
                count++;
        }
        //----------- 8th Neighbour (South-West) ------------
        // Only process this cell if this is a valid one
        if (isValid(row + 1, col - 1)) {
            if (isMine(row + 1, col - 1, realBoard))
                count++;
        }

        return count;
    }

    // A recursive function to play the Minesweeper Game.
    private static boolean playMinesweeperUtil(int row, int col, int movesLeft) {
        // Base case of recursion.
        if (playerBoard[row][col] != '-')
            return (false);

        int i, j = 0;

        // You opened a mine, you loose.
        if (realBoard[row][col] == '*') {
            playerBoard[row][col] = '*';

            for (i = 0; i < MINES; i++) {
                playerBoard[MINES_COORS[i][0]][MINES_COORS[i][1]] = '*';
            }

            printBoard(playerBoard);
            System.out.println("\nYou lost.\n");
            return (true);
        } else {

            // Calculate the number of adjacent mines and put it
            // on the board.
            int count = countAdjacentMines(row, col, realBoard);
            movesLeft--;

            playerBoard[row][col] = (char) (count + '0');

            if (count == 0) {
                /*
                    Recur for all 8 adjacent cells

                        N.W   N   N.E
                          \   |   /
                              \  |  /
                        W----Cell----E
                             / | \
                           /   |  \
                        S.W    S   S.E

                    Cell-->Current Cell (row, col)
                    N -->  North        (row-1, col)
                    S -->  South        (row+1, col)
                    E -->  East         (row, col+1)
                    W -->  West            (row, col-1)
                    N.E--> North-East   (row-1, col+1)
                    N.W--> North-West   (row-1, col-1)
                    S.E--> South-East   (row+1, col+1)
                    S.W--> South-West   (row+1, col-1)
                  */

                //----------- 1st Neighbour (North) ------------
                // Only process this cell if this is a valid one
                if (isValid(row - 1, col)) {
                    if (!isMine(row - 1, col, realBoard))
                        playMinesweeperUtil(row - 1, col, movesLeft);
                }
                //----------- 2nd Neighbour (South) ------------
                // Only process this cell if this is a valid one
                if (isValid(row + 1, col)) {
                    if (!isMine(row + 1, col, realBoard))
                        playMinesweeperUtil(row + 1, col, movesLeft);
                }
                //----------- 3rd Neighbour (East) ------------
                // Only process this cell if this is a valid one
                if (isValid(row, col + 1)) {
                    if (!isMine(row, col + 1, realBoard))
                        playMinesweeperUtil(row, col + 1, movesLeft);
                }
                //----------- 4th Neighbour (West) ------------
                // Only process this cell if this is a valid one
                if (isValid(row, col - 1)) {
                    if (!isMine(row, col - 1, realBoard))
                        playMinesweeperUtil(row, col - 1, movesLeft);
                }
                //----------- 5th Neighbour (North-East) ------------
                // Only process this cell if this is a valid one
                if (isValid(row - 1, col + 1)) {
                    if (!isMine(row - 1, col + 1, realBoard))
                        playMinesweeperUtil(row - 1, col + 1, movesLeft);
                }
                //----------- 6th Neighbour (North-West) ------------
                // Only process this cell if this is a valid one
                if (isValid(row - 1, col - 1)) {
                    if (!isMine(row - 1, col - 1, realBoard))
                        playMinesweeperUtil(row - 1, col - 1, movesLeft);
                }
                //----------- 7th Neighbour (South-East) ------------
                // Only process this cell if this is a valid one
                if (isValid(row + 1, col + 1)) {
                    if (!isMine(row + 1, col + 1, realBoard))
                        playMinesweeperUtil(row + 1, col + 1, movesLeft);
                }
                //----------- 8th Neighbour (South-West) ------------
                // Only process this cell if this is a valid one
                if (isValid(row + 1, col - 1)) {
                    if (!isMine(row + 1, col - 1, realBoard))
                        playMinesweeperUtil(row + 1, col - 1, movesLeft);
                }
            }
        }
        return false;
    }
    
    // A Function to cheat by revealing where the mines are placed.
    private static void cheatMinesweeper(char board[][]) {
        System.out.println("The mines locations are:");
        printBoard(board);
    }

    public static void main(String[] args) {
        initialise();
        printBoard(playerBoard);
        placeRandomMines();
        printBoard(realBoard);

    }
}
