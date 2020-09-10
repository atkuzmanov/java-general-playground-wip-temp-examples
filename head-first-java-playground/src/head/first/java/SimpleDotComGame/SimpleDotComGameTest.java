package head.first.java.SimpleDotComGame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static head.first.java.SimpleDotComGame.SimpleDotComGame.generateRandomLocations;

class SimpleDotComGameTest {
    @Test
    void testGenerateRandomLocations() {
        ArrayList<String> testLocations = generateRandomLocations();

        System.out.println("> String testLocations size: " + testLocations.size());
        for(String cell : testLocations) System.out.println("> " + cell);

        assert (testLocations.size() == 3);
    }
}
