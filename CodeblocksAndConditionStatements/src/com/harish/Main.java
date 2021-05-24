package com.harish;

public class Main {

    public static void main(String[] args) {

        boolean gaveOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 30;

        if( score == 100){
            System.out.println("Your score was 1000");
        }
//       Above in the if section the starting curly brace "{" to ending curly brace "}" forms a code block.
//        If there is a single statement in the code block then the curly braces can be omitted.

        if(bonus == 30)
            System.out.println("This is a code block without curly braces");
//        recommended to put a curly braces even for a single statement

        if(levelCompleted > 10){
            System.out.println("successfully completed levels more than 5");
        }else{
            System.out.println("Levels completed are very low");
        }

        if(levelCompleted > 10){
            System.out.println("successfully completed levels more than 5");
        }else if(levelCompleted < 10){
            System.out.println("Levels completed are very low");
        }else{
            System.out.println("404 ERROR!");
        }

        if(gaveOver){
            int finalScore = score +(levelCompleted * bonus);
            System.out.println("Your final score was "+finalScore);
        }

    }
}
