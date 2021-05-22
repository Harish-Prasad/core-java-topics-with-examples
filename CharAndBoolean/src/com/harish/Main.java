package com.harish;

public class Main {

    public static void main(String[] args) {

        char charFirstValue = 'H';
        System.out.println(charFirstValue);
//  Here char occupies two(2) bytes of memory where in other middle level programming languages like c/c++ occupies 1 byte.
//  char occupies 2 bytes because it allows to store UNICODE(Universal Code) characters where as in c/c++ it follows ASCII(American Standard code for information interchange) encoding scheme.

        char charSecondValue = '\u00A9';
//    backslash(\) u indicate that it is UNICODE character
        System.out.println(charSecondValue);

// Boolean values allows for two choices True or False, Yes or NO, 1 or 0

        boolean isTrue = true;
        boolean isFalse = false;
        boolean isLoggedIn = true;
        boolean isVehicleRunning = false;





    }
}
