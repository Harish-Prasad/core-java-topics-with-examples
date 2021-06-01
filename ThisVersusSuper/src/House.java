
public class House {

    private String color;

    public House(String color){
//    this keyword is required, same parameter name as field.
        this.color = color;
    }

    public String getColor(){
//     here this is optional one can also write has * return this.color *
        return color;
    }

    public void setColor(String color){
        //    this keyword is required, same parameter name as field.
        this.color =color;
    }

}
