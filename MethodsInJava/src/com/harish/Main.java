package com.harish;

public class Main {

    public static void main(String[] args) {
/*
        A Java method is a collection of statements that are grouped together to perform an operation.
        When you call the System. out. println() method, for example, the system actually executes several
        statements in order to display a message on the console.
*/
/*
    A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
 */
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 30;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); // Method call (Driver Code)
        //      The arguments passed in the method call are called just arguments.
        System.out.println("your final score was "+highScore);

         gameOver = true;
         score = 5000;
         levelCompleted = 10;
         bonus = 200;
         highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was "+highScore);
        System.out.println();
        System.out.println();

//        Calculate the positions achieved for different Players

        String Playername = "Harish Prasad";
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(Playername, highScorePosition);
        Playername = "Nagesh Prasad";
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition(Playername, highScorePosition);

        Playername = "Rohit Sharma";
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(Playername, highScorePosition);

        Playername = "Sachin Tendulkar";
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition(Playername, highScorePosition);
    }

//    Method Definition (Driven Code)
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//  The arguments passed in the method definition are called parameters.

        if(gameOver){
            int finalScore = score +(levelCompleted * bonus);
            return finalScore;
        }else{
            return -1;
        }
    }

    public static void displayHighScorePosition(String Playername, int highScorePosition){
        System.out.println(Playername+" managed to get into position "+highScorePosition+" on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        }else if(playerScore > 500 && playerScore < 1000){
            return 2;
        }else if(playerScore > 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }

    }


}
