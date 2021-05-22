package com.harish;

public class Main {

    public static void main(String[] args) {

      float myMinFloatValue = Float.MIN_VALUE;
      float myMaxFloatValues = Float.MAX_VALUE;
        System.out.println("Minimum Float Range = "+myMinFloatValue);
        System.out.println("Maximum Float Range = "+myMaxFloatValues);

      double myMinDoubleValue = Double.MIN_VALUE;
      double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Range = "+myMinDoubleValue);
        System.out.println("Maximum Double Range = "+myMaxDoubleValue);

        int myIntValue = 15;
        float myFloatValue = 5.25f; // (or)
        float mySecondFloatValue = (float) 5.25;
        double myDoubleValue = 10d;

//  Between double and float, double act as default value if one does not specify float explicitly by adding 'f' after the value.

        int intValue = 10 / 3;
        float floatValue = 20f / 3f;
        double doublevalue = 20d / 3d;
        System.out.println("Int value "+intValue);
        System.out.println("Float value "+floatValue);
        System.out.println("Double value "+doublevalue);
//        Recommended to use double datatype instead of float.

//        Convert a given number of pounds to Kilograms

        double pounds = 10d;
        double kilograms = (pounds * 0.45359237d);
        System.out.println(pounds+" pounds is equal to "+kilograms+" kilograms");

    }
}
