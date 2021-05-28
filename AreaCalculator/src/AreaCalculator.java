
public class AreaCalculator {

    public static void main(String[] args) {
        double areaOfCircle = area(2d);
        System.out.println("Area of given circle is "+areaOfCircle);
        double areaOfRectangle = area(2d,2d);
        System.out.println("Area of given Rectangle is "+areaOfRectangle);
    }
    public static double area(double radius){
        if(radius < 0)
            return -1;
        double areaOfCircle = radius * Math.PI * radius;
        return areaOfCircle;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0)
            return -1;
        double areaOfRectangle = x * y ;
        return areaOfRectangle;
    }

}
