package head.first.java.arraysandgrids.chap13arraysgrids;

import java.util.HashMap;
import java.util.Map;

/**
 * Head First Java book, Chapter 13, pages 422-423 and others linked to those.
 * Grid representation as single linear array.
 * Grid 7x7 equals to an array of size 49.
 * Grid is 0 based. Array is 0 based.
 * Searching for items in the array[49] and calculating their coordinates in [7x7] grid.
 */
public class Arrays2GridPosition2 {

    private static int gridSize = 7;
    private static int[][] grid2d = new int[gridSize][gridSize];
    private static int gridAsFlat1dArraySize = gridSize * gridSize;
    private static int[] grid1d = new int[gridAsFlat1dArraySize];

    public static void main(String[] args) {
        int mysteryNumber = 7;
        System.out.println("___Initializing the grid___");
        System.out.println("Mystery number grid coordinates & position: \n" + initGrids(mysteryNumber));
        System.out.println("------------------------------------");
        System.out.println("Found mystery number " + mysteryNumber + " at position: "
                + findPositionOfCoordinatesInFlat1dLinearArray(mysteryNumber));
    }

    public static int findPositionOfCoordinatesInFlat1dLinearArray(int mysteryNumber) {

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (grid2d[i][j] == mysteryNumber) {
                    return j + (gridSize * i);
                }
            }
        }

        return -1;
    }

    public static Map initGrids(int mysteryNumber) {
        // int xRow = (int) (Math.random() * gridSize);
        // int yColumn = (int) (Math.random() * gridSize);
        int xRow = 3; // hardcoding for debugging
        int yColumn = 5; // hardcoding for debugging

        grid2d[xRow][yColumn] = mysteryNumber;

        int positionInFlat1dArrayRepresentationOfGrid = yColumn + (gridSize * xRow);

        grid1d[positionInFlat1dArrayRepresentationOfGrid] = mysteryNumber;

        Map<String, Integer> coordinates = new HashMap<>();
        coordinates.put("xRow", xRow);
        coordinates.put("yColumnt", yColumn);
        coordinates.put("positionInFlat1dArrayRepresentationOfGrid", positionInFlat1dArrayRepresentationOfGrid);

        return coordinates;
    }
}
