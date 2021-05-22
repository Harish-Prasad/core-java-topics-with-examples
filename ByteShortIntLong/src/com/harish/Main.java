// package is the way to organize java projects, here com is the main directory and harish
// is the subdirectory so it can be specified as "com.harish"

// semicolon is used to indicate the end of the statements that is it act as a delimiter.
// package is a keyword.

package com.harish;


public class Main {

    public static void main(String[] args) {

    byte firstNumber = 120;
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = "+myMinByteValue);
        System.out.println("Byte Maximum value = "+myMaxByteValue);

        short secondNumber = 120;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = "+myMinShortValue);
        System.out.println("Short Maximum value = "+myMaxShortValue);


        int thirdNumber = 120;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = "+myMinIntValue);
        System.out.println("Integer Maximum value = "+myMaxIntValue);

        System.out.println("Busted Max value = "+(myMaxIntValue + 1));
// Here the Integer value is crossing the range of Integer this causes Overflow condition.

        System.out.println("Busted Min value = "+(myMinIntValue - 1));
// Here the Integer value is less then the  range of Integer this causes underflow condition.


        long forthNumber = 120L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = "+myMinLongValue);
        System.out.println("Long Maximum value = "+myMaxLongValue);


//    Some Arithmetics and casting on the above data_types




    }
}
