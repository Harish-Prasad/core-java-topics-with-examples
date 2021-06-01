/*
        METHOD OVERLOADING

--> Overloading does not have anything to do with polymorphism but Java developers often refer to overloading as
    Compile time Polymorphism.
--> In other words the compiler decided when method is going to be called based on the method name, return type and
    argument list.
--> We can overload static and instance methods.
--> Usually overloading happens inside a single class, but a method
    can also be treated as overloaded in the subclass of that class.
--> That is because a subclass inherits one version of the method from the parent class
    and then the subclass can have another overloaded version of the method.
METHODS WILL BE CONSIDERED OVERLOADED IF BOTH FOLLOW THE FOLLOWING RULES
--> Methods must have the same method name.
--> Methods must have different parameters.
IF METHODS FOLLOW THE RULES ABOVE THEN THEY MAY OR MAY NOT
--> Have different return types.
--> Have different access modifiers.
--> Throw different checked or unchecked exceptions.

        METHOD OVERRIDING

--> Method overriding means defining a method in a child that already exists in the parent class with
    same signature(same name, same arguments)
--> By extending the parent class the child class gets all the methods defined in the parent class(those methods also known as derived methods).
--> Method overriding is also knows as RUNTIME POLYMORPHISM AND DYNAMIC METHOD DISPATCH, because the methods that is going
    to be called is decided at runtime by the JVM.
--> When we override a method it's recommended to pur @Override immediately above the method definition.
    This is a annotation that a compiler reads and will then show us an error if we don't follow overriding rules correctly.
--> One can't override static methods only instance methods.
METHODS WILL BE CONSIDERED OVERLOADED IF BOTH FOLLOW THE FOLLOWING RULES
--> It must have same name and same arguments.
--> Return type can be a subclass of the return type in the parent class.
--> It can't have a lower access modifier.
--> For example if a parent method is protected then using private in the child is not allowed but using public in the
    child class would be allowed.


NOTE:
--> Only inherited methods can be overridden, in other words methods can be overridden only in child classes.
--> Constructors and private methods cannot be overridden.
--> Methods that are final cannot be overridden.
--> A SubClass can use super.methodName() to call the superClass version of an overridden methods.

 */


public class MethodOverloadingAndOverridingNotes {
    public static void main(String[] args) {

//  method overloading call
        bark();
        bark(3);

// method overriding call
        GermanShepard dog = new GermanShepard();
        dog.bark();
    }

    public static void bark(){
        System.out.println("Barking with no arguments");
    }
    public static void bark(int number){
        for(int i = 0; i < number; i++)
            System.out.println("Barking with one arguments");
    }
}
