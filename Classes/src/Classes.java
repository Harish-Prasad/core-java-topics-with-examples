

// A class --the basic building block of an object-oriented language such as Java --is a
// template that describes the data and behavior associated with instances of that class.
// When you instantiate a class you create an object that looks and feels like other instances of the same class.

public class Classes {
    public static void main(String[] args) {

        Car ford;
        ford = new Car();

        Car swift = new Car();

        ford.setDoors(4);
        ford.setModel("example");

        System.out.println(ford.getModel());
        System.out.println(ford.getDoors());

        swift.setDoors(3);
        swift.setModel("RFH650");

        System.out.println(swift.getModel());
        System.out.println(swift.getDoors());
    }
}
