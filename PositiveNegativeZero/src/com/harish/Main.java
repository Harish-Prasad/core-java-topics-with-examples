package com.harish;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkNumber(number);
    }
    public static void checkNumber(int number){

        if(number > 0)
            System.out.println("positive");
        else if(number < 0)
            System.out.println("negative");
        else
            System.out.println("Zero");
    }

}
