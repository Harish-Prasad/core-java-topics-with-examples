/*

STATIC VARIABLES

--> Declared by using the keyword static.
--> static variables are also known as static member variables.
--> Every instance of that class shares the same static variable.
--> If changes made to that variable, all other instances will see the effect
    of the change.
--> static variables are not used very often but can sometimes be very useful.

INSTANCE VARIABLE

--> They don't use the static keyword.
--> Instance variables are also known as fields or member variables.
--> Instance variables belong to an instance of a class.
--> Every instance has it's own copy of an instance variable.
--> Every instance can have a different value(state).
--> Instance variables represent the state of an instance.

 */

public class StaticAndInstanceVariable {
    public static void main(String[] args) {

//      Static variables Demonstration.
        Dog dg1 = new Dog("german1");  // create instance
        Dog dg2 = new Dog("german2");   // create instance
        dg1.printName();   // output: german2
        dg2.printName();    // output: german2

//      Instance variables Demonstration.
        Cat ct1 = new Cat("cat1");  // create instance
        Cat ct2 = new Cat("cat2");   // create instance
        ct1.printName();   // output: cat1
        ct2.printName();    // output: cat2

    }
}

class Dog{
    private static String name; // declaration of static variable with static keyword.
    public Dog(String name){
        Dog.name = name;
    }
    public void printName(){
        System.out.println("Name is "+name);
    }
}

class Cat{
    private  String name;
    public Cat(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println("Name is "+name);
    }
}