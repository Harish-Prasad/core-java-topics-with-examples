package com.harish;

public class Main {

    public static void main(String[] args) {

// The if-then statement is the most basic of all the control flow statements.
// it tells your program to execute a certain section of code if a particular test evaluates to true this is known as conditional logic.

//  conditionals logic uses specific statements in java to allow us to check a condition and
//   execute certain code based on whether that condition (the expression) is true or false.

        boolean isHuman = true;
        if (isHuman) {
            System.out.println("It is a Human! :) ");
        }

        int age = 18;
        if (age == 18)
            System.out.println("Eligible to cast a vote");
        else
            System.out.println("Not eligible to cast a vote");
//     Logical operators help us to make logical Decision.
//     Logical operators are &&(logical AND), ||(logical OR), !(logical NOT)

        int marksObtained = 90;
        if (marksObtained >= 85)
            System.out.println("It is a Pretty Good score!");

        if (marksObtained <= 85)
            System.out.println("It is a Pretty Good score!");// This will not be printed because the expression result is false.

        int firstMark = 50;
        int secondMark = 60;

        if (firstMark != secondMark)
            System.out.println("The scores are not equal");
        else
            System.out.println("The scores are Equal");

        if (firstMark >= 50 && secondMark < 80)
            System.out.println("condition holds good.");

        if (firstMark >= 50 || secondMark < 50)
            System.out.println("atleast one  condition holds good.");

        boolean isAlive = true;
        if (!isAlive)
            System.out.println("Person is Alive");// This will not get printed due to false condition.

//      Ternary operator is a operator with three expression which acts like a if-then construct.
//        syntax:      variableName = checkCondition ? ifTruePrint : ifFalsePrint

        boolean result = (5 > 2) ? true : false;
        System.out.println("Ternary operator output "+result);

//  Precedence : The order in which operation is carried out. More than one operator can have same level precedence then Associativity comes into picture.
//  Associativity : it specifies in which direction the operations has to start that is left-to-right or right-to-left.
//  Almost all operators starts from left-to-right by default except few which are mentioned below starts from right-to-left.

//    ++ unary increment
//    -- unary decrement
//    + unary plus
//    - unary minus
//    ! unary logical negation
//    ~ unary bitwise complement
//        (type) unary type cast



//  link to precedence & associativity table :  http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

    }
}