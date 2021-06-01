// Dog is Derived Class from Animal Which is Base class.

public class Dog extends Animal{

    private int eyes;
    private  int legs;
    private int tail;
    private String coat;
    private int teeth;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, String coat,int teeth) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
        this.teeth  = teeth;
    }

    public void chew(){
        System.out.println("Doge.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dob.eat() is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(4);
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(8);
    }


}