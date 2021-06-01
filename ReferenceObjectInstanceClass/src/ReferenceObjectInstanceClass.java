
/*
Let's use the analogy of building a house to understand Classes.

--> A Class is basically a blueprint for a house, using the blueprint(plans) we can build as many houses as we like
    based on those plans.

--> Each house you build (in other words instantiate using new operator) is an object also known as Instance.

---> Each house you build as an address(a physical location). In other words if you want to tell someone where you live
    you give them your address (perhaps written on a piece of paper). This is known as Reference.

-->  One can copy that Reference as many times as you like but there is still just one house. In other words we are
    copying the paper that has address on it not the house itself.

--> One can pass Reference as parameters to constructors and methods.

 */

public class ReferenceObjectInstanceClass {

    public static void main(String[] args) {

        House yellowHouse = new House("yellow");
        House anotherHouse = yellowHouse;

        System.out.println(yellowHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("brown");
        System.out.println(yellowHouse.getColor());
        System.out.println(anotherHouse.getColor());

        House whiteHouse = new House("white");
        anotherHouse = whiteHouse;

        System.out.println(yellowHouse.getColor());
        System.out.println(whiteHouse.getColor());
        System.out.println(anotherHouse.getColor());
    }
}
