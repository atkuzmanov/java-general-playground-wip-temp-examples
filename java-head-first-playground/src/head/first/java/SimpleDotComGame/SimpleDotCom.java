package head.first.java.SimpleDotComGame;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;
    private int numOfGuesses = 0;
    private String name = "";
    private boolean isAlive = true;

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
            isAlive = false;
        }

        System.out.println("> " + result);

        numOfGuesses++;

        return result;
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public int getNumOfGuesses() {
        return numOfGuesses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
