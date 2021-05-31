
// public is a Access modifier, here public means this class can be accessed globally that is anywhere from the program.

public class Car {

    // Private access modifier can be accessed only within the class.

    private int doors;
    private int wheels;
    private String engine;
    private String colour;
    private String model;

    public void setModel(String model){
        this.model = model;
    }
    public  void setDoors(int doors){
        this.doors = doors;
    }

    public String getModel(){
        return  this.model;
    }
    public int getDoors(){
        return this.doors;
    }

}
