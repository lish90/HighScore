package com.lish90;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tina",highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Alisha",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName  + " managed to get into position " + highScorePosition + " on the high score table");
    }

   public  static int calculateHighScorePosition (int playerScore){

        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500){
            return 3;
        }
        return 4;
    }
}




