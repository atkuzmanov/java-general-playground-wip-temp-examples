package head.first.java.SimpleDotComGame;

import org.junit.jupiter.api.Test;

import static head.first.java.SimpleDotComGame.SimpleDotComGame.generateRandomLocations;

class SimpleDotComGameTest {
    @Test
    void testGenerateRandomLocations() {
        int[] testLocations = generateRandomLocations();

        System.out.println("> int testLocations length: " + testLocations.length);
        for(int cell : testLocations) System.out.println("> " + cell);

        assert (testLocations.length == 3);
    }
}
