package com.harish;

public class Main {

    public static void main(String[] args) {

//    String is a datatype in java, which is not a primitive type.
//    it's actually a Class
//    String is a sequence of characters enclosed within double quotes.

        String userName = "Harish Prasad";
        System.out.println("User Name for login is "+userName);

        String combineString = userName + " Rohit ";
        System.out.println("combined String is "+combineString);
        System.out.println();

        String creatorName = "Harish Prasad, ";
        String message = "Made with love ";
        String footer = combineString + message + "\u00A9 2021";
        System.out.println(footer);

        int IntValue = 26;
        String joinWithIntValue = "80808080" + IntValue;
        System.out.println(joinWithIntValue);

//  String in Java are Immutable means it  cannot be changed.



    }
}
