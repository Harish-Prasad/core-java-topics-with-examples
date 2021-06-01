/*
   STATIC METHOD
--> static methods are declared using static modifier.
--> static methods can't access instance methods and instance variables directly.
--> They are usually used for operations that don't require any data from an instance of the class(from this).
--> this keyword is the current instance of a class.
--> whenever one see a method that does not use instance variables that method
    should be declared as a static method.
--> For example main is a static method and it is called by the JVM when it start an application.

INSTANCE METHOD

--> Instance methods belong to an instance of a class.
--> To use an instance method we have to instantiate the class first usually
    the new keyword.
--> Instance methods can access instance methods and instance variables directly.
--> Instance methods can also access static methods and static variables directly.


 */

public class StaticAndInstanceMethod {

    public static void main(String[] args) {

        Calculator.printSum(6,12); // call static method.
        printHello(); // call static method.
        Dog dg = new Dog();  // create instance.
        dg.bark(); // call instance method.

    }
    public static void printHello(){
        System.out.println("Hello");
    }
}

class Calculator{
    public static void printSum(int a, int b){
        System.out.println("sum = "+( a + b ));
    }
}

class Dog{
    public void bark(){
        System.out.println("Dog is barking...");
    }
}
