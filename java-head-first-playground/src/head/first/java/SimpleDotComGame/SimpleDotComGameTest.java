package head.first.java.SimpleDotComGame;

import org.junit.jupiter.api.Test;

public class SimpleDotComGameTest {
    @Test
    public void testGenerateRandomLocations() {
        SimpleDotComGame game1 = new SimpleDotComGame();

        int[] testLocations = game1.generateRandomLocations();

        System.out.println("> int testLocations length: " + testLocations.length);
        for(int cell : testLocations) System.out.println("> " + cell);

        assert (testLocations.length == 3);
    }
}
