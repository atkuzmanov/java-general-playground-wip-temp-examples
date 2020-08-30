package head.first.java.SimpleDotComGame;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom dot1 = new SimpleDotCom();

    }

    public int[] generateRandomLocations() {
        int[] newRandomLocations = new int[3];
        int min = 0;
        int max = 6;
        int firstCell = (int) (Math.random() * ((max - min) + 1)) + min;
        int randomGrowDirection = (int) (Math.random() * ((9 - min) + 1)) + min;
        // Boolean growForward = randomGrowDirection % 2 == 0 ? true : false;
        Boolean growForward = randomGrowDirection % 2 == 0;

        if (firstCell >= 5) {
            growForward = false;
        }

        if (firstCell <= 1) {
            growForward = true;
        }

        for(int i = 0; i < newRandomLocations.length; i++) {
            if(growForward) {
                newRandomLocations[i] = firstCell;
                firstCell++;
            } else {
                newRandomLocations[i] = firstCell;
                firstCell--;
            }
        }

        return newRandomLocations;
    }
}
