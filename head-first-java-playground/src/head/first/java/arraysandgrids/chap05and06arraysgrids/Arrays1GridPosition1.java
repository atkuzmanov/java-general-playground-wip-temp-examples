package head.first.java.arraysandgrids.chap05and06arraysgrids;

import java.util.HashMap;
import java.util.Map;

/**
 * Head First Java book, Chapter 6, pages 152-153 and others linked to those.
 * Grid representation as single linear array.
 * Grid 7x7 equals to an array of size 49.
 * Grid is 0 based. Array is 0 based.
 * Searching for items in the array[49] and calculating their coordinates in [7x7] grid.
 *
 * Example (in pseudocode):
 *
 * int positionLocation = 27
 * int row = (int) ((positionLocation - 1) / gridLength) = (27-1)/7 = 26/7 = 3.71... = 3
 * int column = (positionLocation - 1) % gridLength = (27-1)%7 = 26%7 = 5
 */
public class Arrays1GridPosition1 {

    private static int gridLength = 7;
    private static int gridSize = 49;
    private static int[] grid = new int[gridSize];

    public static void main(String[] args) {
        System.out.println(">>> gridSize: " + gridSize);
        System.out.println(">>> grid.lenght: " + grid.length);
        System.out.println("_________");
        int mysteryNumber = -1;
        int gridRandomPosition = initGridWithRandomPosition(mysteryNumber);
        System.out.println("Initializing grid with mystery number " + mysteryNumber + " at position: " + gridRandomPosition);
        System.out.println("Mystery number found in grid at coordinates: " + findCoordinatesOfSearchedNumberInGrid(mysteryNumber, gridRandomPosition));
    }

    public static Map findCoordinatesOfSearchedNumberInGrid(int n, int positionInLinearGrid) {
        Map<String, Integer> coordinates = new HashMap<>();
        int x = 0;
        int row = 0;
        int column = 0;
        // System.out.println("\n");
        while (x < gridSize) {
            if (grid[x] == n) {
                row = (int) ((positionInLinearGrid - 1) / gridLength); // get numeric row value // subtracting -1 from position as grid is 0 based
                column = (positionInLinearGrid - 1) % gridLength; // get numeric column value // subtracting -1 from position as grid is 0 based
                coordinates.put("row", row);
                coordinates.put("column", column);
                break;
            }
            x++;
        }

        return coordinates;
    }

    public static int initGridWithRandomPosition(int mysteryNumber) {
        int location = (int) (Math.random() * gridSize);      // place at random position
        // int location = 27; // hardcoding for debugging
        grid[location] = mysteryNumber;

        return location;
    }
}
