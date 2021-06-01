// Method Overriding Demonstration

public class Dog {
    public  void bark(){
        System.out.println("Barking in the Parent Class");
    }
}
class GermanShepard extends Dog{

    @Override
    public void bark() {
        super.bark();
        System.out.println("Barking in the Child Class");
    }
}
