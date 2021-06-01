// Fish is Derived Class from Animal Which is Base class.

public class Fish extends Animal{

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    private void rest(){
        System.out.println("Fish.rest() is called");
    }
    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() is called");
        rest();
    }
    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() is called");
    }
    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
