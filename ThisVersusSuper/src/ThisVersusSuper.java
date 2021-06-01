
/*
--> The keyword *super* is used to access/call the parent class members(variables and methods).
--> The keyword *this* is used to call the current class members(variables and methods).
    This is required when we have a parameter with the same name as an instance(object) variable(field).

NOTE: We can use both of them anywhere in a class except static areas(the static block or static methods)
      Any attempt to do so will lead to compile-time errors.

--> The keyword *this* is commonly used in constructors and setters and optionally in getters.
--> The keyword *super* is commonly used with method Overriding, when we call a method with the same name from the parent class.

--> In Java we have the this() and the super() call.
--> Use this() to call a constructor from another overloaded constructor in the same class.
    The call to this() can be used only in a constructor, and it must be the first statement in
    a constructor. it's used in constructor chaining, in others words when one constructor calls
    another constructor, and helps to reduce duplicated code.

--> The only way to call parent constructor is by calling super(). This calls the parent constructor.
---> The Java Compiler puts a default call to super() if we don't add it, and it is always the no-args
     super which is inserted by the compiler(constructor without arguments)
--> The call to super() must be the first statement in each constructor.

NOTE: A constructor can have a call to super() or this() but not both.

 */
public class ThisVersusSuper {
    public static void main(String[] args) {
        House yellowHouse = new House("yellow");
        System.out.println(yellowHouse.getColor());

//  Demonstration of Super Keyword
        SubClass child = new SubClass();
        child.printMethod();

    }
}
