
public class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class RectAngle extends Shape{
    private int width;
    private int height;

// First Constructor
    public RectAngle(int x, int y){
        this(x,y,0,0); // calls second constructor
    }

    public RectAngle(int x, int y, int width, int height) {
        super(x, y);  // calls constructor from parent class (Shape).
        this.width = width;
        this.height = height;
    }
}
