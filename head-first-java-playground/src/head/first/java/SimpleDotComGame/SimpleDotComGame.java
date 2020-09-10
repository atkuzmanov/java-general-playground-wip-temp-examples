package head.first.java.SimpleDotComGame;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        GameHelper helper = new GameHelper();

        DotCom dot1 = new DotCom();
        dot1.setName("SimpleDotCom1");
        dot1.setLocationCells(generateRandomLocations());

        while (dot1.isAlive()) {
            String guess = helper.getUserInput("Enter a number: ");
            String result = dot1.checkYourself(String.valueOf(guess));
            if(result.equals("kill")) {
                dot1.setAlive(false);
                System.out.println("You took " + dot1.getNumOfGuesses() + " guesses to sink battleship " + dot1.getName());
            }
        }
        System.out.println("Game Over");
    }

    static ArrayList<String> generateRandomLocations() {
        ArrayList<String> newRandLocsStr = new ArrayList<>();

        int min = 0;
        int max = 6;
        int firstCell = (int) (Math.random() * ((max - min) + 1)) + min;
        int randomGrowDirection = (int) (Math.random() * ((9 - min) + 1)) + min;
        // Boolean growForward = randomGrowDirection % 2 == 0 ? true : false;
        boolean growForward = randomGrowDirection % 2 == 0;

        if (firstCell >= 5) {
            growForward = false;
        }
        if (firstCell <= 1) {
            growForward = true;
        }

        for (int i = 0; i < 3; i++) {
            if (growForward) {
                newRandLocsStr.add(String.valueOf(firstCell));
                firstCell++;
            } else {
                newRandLocsStr.add(String.valueOf(firstCell));
                firstCell--;
            }
        }

        return newRandLocsStr;
    }
}
