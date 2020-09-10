package head.first.java.SimpleDotComGame;

import org.junit.jupiter.api.Test;

public class SimpleDotComTest {

    @Test
    public void testSimpleDotCom() {
        SimpleDotCom dot1 = new SimpleDotCom();

        int[] locations = {2, 3, 4};

        dot1.setLocationCells(locations);

        String userGuess = "2";

        String result = dot1.checkYourself(userGuess);

        String testResult = "failed";

        if(result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(">>> " + testResult);

        assert (testResult.equals("passed"));
    }

}
