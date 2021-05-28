
public class SwitchStatement {

    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:
                System.out.println("Value was 4");
                break;
            default:
                System.out.println("Invalid options");
                break;
        }

        char checkSwitch = 'D';
        switch (checkSwitch){
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Char was B");
                break;
            case 'C':
                System.out.println("Char was C");
                break;
            case 'D':
                System.out.println("Char was D");
                break;
            case 'E':
                System.out.println("Char was E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String month = "February";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("String is January");
                break;
            case "february":
                System.out.println("String is february");
                break;
            case "march":
                System.out.println("String is march");
                break;
            case "april":
                System.out.println("String is april");
                break;
            case "may":
                System.out.println("String is may");
                break;
            default:
                System.out.println("Not a Valid String ");
                break;
        }
    }

}
