package head.first.java.SimpleDotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    private int numOfGuesses = 0;
    private String name = "";
    private boolean isAlive = true;

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if(index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "kill";
                isAlive = false;
            } else {
                result = "hit";
                numOfHits++;
            }
        }

        numOfGuesses++;
        System.out.println("> " + result);

        return result;
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setLocationCells(ArrayList<String> locations) {
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
