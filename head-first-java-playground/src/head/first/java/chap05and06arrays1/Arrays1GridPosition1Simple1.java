package head.first.java.chap05and06arrays1;

import java.util.HashMap;
import java.util.Map;

public class Arrays1GridPosition1Simple1 {

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
