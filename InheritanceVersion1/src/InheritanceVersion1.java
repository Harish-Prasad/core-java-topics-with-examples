
// Inheritance is a capability of one class to inherit the properties of another class.
// The Class from where the properties are inherited is called Base/Parent Class.
// The Class that inherit the properties is called Derived/Child Class.
// The Derived/Child Class will inherit all the properties along with the behaviour of Base/Parent Class.

public class InheritanceVersion1 {

    public static void main(String[] args) {

        Animal an = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("yo",8,20,2,4,1,"longk",20);

        dog.eat();
        dog.walk();
        dog.run();

        Fish fs = new Fish("gold",5,3,2,2,2);
        fs.swim(4);

    }
}
