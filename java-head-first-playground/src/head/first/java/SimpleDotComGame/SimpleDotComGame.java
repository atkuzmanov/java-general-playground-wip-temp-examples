package head.first.java.SimpleDotComGame;

public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom dot1 = new SimpleDotCom();
        dot1.setName("SimpleDotCom1");
        dot1.setLocationCells(generateRandomLocations());

        // Ask user for a guess
        int userGuess = (int) (Math.random() * ((6 - 0) + 1)) + 0;

        String result = dot1.checkYourself(String.valueOf(userGuess));
        while (!result.equals("kill")) {
            userGuess = (int) (Math.random() * ((6 - 0) + 1)) + 0;
            result = dot1.checkYourself(String.valueOf(userGuess));
        }

        System.out.println("You took " + dot1.getNumOfGuesses() + " guesses to sink battleship " + dot1.getName());
        System.out.println("Game Over");
    }

    static int[] generateRandomLocations() {
        int[] newRandomLocations = new int[3];
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
