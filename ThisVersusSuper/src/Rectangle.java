
public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

//    First Constructor
    public Rectangle(){
        this(0,0); // calls second constructor
    }

// Second Constructor
    public Rectangle(int width, int height){
        this(0,0,width,height);  // calls third constructor
    }

// Third Constructor
    public  Rectangle(int x, int y, int width, int height){
//        initialize Variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
