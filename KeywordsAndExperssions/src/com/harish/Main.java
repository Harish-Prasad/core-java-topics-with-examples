package com.harish;

public class Main {

    public static void main(String[] args) {
	// Keywords are the reserved words in java which has a special meaning and purpose.
//   There are total 53 keywords in java currently.

        int intNumber = 5; // here int is a keyword
//      true, false, null are also keywords
//     valid combination of operators and operands are called Expression.

        int highScore = 50;
        double kilometres = (100 * 1.609344);
        if( highScore == 50){
            System.out.println("This is an expression");
        }
// Below code snippets is the Expression Examples
        int totalMarks = 100;  // it is a expression excluding the datatype.
        if(totalMarks > 80){ // whatever is present within a parentheses is expression.
            System.out.println("You have got the high score!");  // string within the parentheses is also expression.
            totalMarks = 0;  //expression
        }
//  A statement specifies an action in a Java program, and it is always terminated by appending semicolon at the end of the statements.

        int myNumber = 10; // this is a complete statement.
//        Few more examples for statements are given below:
        myNumber++;
        myNumber--;
        System.out.println("This is a example of statement");

        System.out.println("This is also"+
                "a example"+"of statement");


        int strangeSyntax
                =
                50
                ; // This is not recommended way but one can type syntax as such.


    }
}
