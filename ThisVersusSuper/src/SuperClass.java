
public class SuperClass {  //  SuperClass alias Parent Class
    public void printMethod(){
        System.out.println("Printed in super class");
    }
}

 class SubClass extends SuperClass{  //  SubClass alias Child Class

// overrides methods from Parent Class
    @Override
    public void printMethod() {
        super.printMethod(); // calls methods in SuperClass (parent)
        System.out.println("Printed in Sub class");
    }
}
