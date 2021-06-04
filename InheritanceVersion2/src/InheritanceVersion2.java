/*

--> All the classes by default implement the class called Object class which is at the top of class hierarchy.
--> if a class is not extending any of other class then it vll extend Object class by default which is present in java.lang Package.
--> java.lang package is imported dy default as it contains the basic classes, interfaces and other sub-packages
    which are required for writing a java program.

some of the methods which are implemented in Object class and are available to all other classes are as follows:

1. hashCode() :int      // int is a return type
2. toString :String    // String is a return type
3. equals() :boolean    // boolean is a return type
4. finalize()   :void   // void is a return type
5. clone()  :Object     // Object is a return type
6. notify(), notifyAll, wait() etc...

 */

public class InheritanceVersion2  {
    public static void main(String[] args) {

        Swift swift = new Swift(32);
        swift.steer(38);
        swift.accelerate(30);
        swift.accelerate(20);
        
    }
}
