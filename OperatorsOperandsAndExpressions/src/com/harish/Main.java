package com.harish;

public class Main {

    public static void main(String[] args) {

//   operators in java are special symbols that perform specific operations on one, two, or three operands
//   operands is a term used to describe any object that is manipulated by an operator.

      int intValue = 10 + 15;
//  In the above example +(plus) is a operator and 10 and 15 are operands.
      int intFirst = 20;
      int intSecond = 10;
      int result = intFirst - intSecond;
//  In the above example -(minus) is a operator and intFirst and intSecond are operands.

//  Expression is formed by combining variables, literals, method return values.

     double addition = intFirst / intSecond;
//  In the above example  intFirst / intSecond is a valid expression.

        int sum = 10 + 30; // 10 + 30 = 40
        System.out.println("summation of two numbers is "+sum);
//   Comments are ignored by the computer and added to a program to help describe something.
//   comments are there for humans but not for machines, they tend to start with two forward slash (//) which are called as single line comments.

        double doubleValue1 = 10.2569d;
        double doubleValue2 = 6.256d;
        double resultOfDoubleValues = doubleValue1 * doubleValue2;
        System.out.println("check out the result of double values multiplications "+resultOfDoubleValues);

//   Abbreviating Operators or Unary Operators(Increment & Decrement)

        int checkIntValue = 5;

            System.out.println(checkIntValue);     // output: 5
            checkIntValue++;

//   checkIntValue = checkIntValue + 1  is same as  checkIntValue++ which is also same as checkIntValue += 1

            System.out.println(checkIntValue);      // output: 6

            checkIntValue--;

//   checkIntValue = checkIntValue - 1  is same as  checkIntValue-- which is also same as checkIntValue += 1

             System.out.println(checkIntValue);     // output: 5

//        Short-Hand Notation
        System.out.println("---------- SHORT-HAND NOTATION FOR DIFFERENT ARITHMETIC OPERATORS ----------");
        int myNum = 10;
        System.out.println(myNum += 1);
        System.out.println(myNum -= 2);
        System.out.println(myNum *= 3);
        System.out.println(myNum /= 4);
        System.out.println(myNum %= 1);

    }
}
