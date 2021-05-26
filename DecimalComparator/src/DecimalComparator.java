
public class DecimalComparator {
    public static void main(String[] args) {
    boolean isEqual = areEqualByThreeDecimalPlaces(-3.1234,-3.123);
        System.out.println(isEqual);
    }
    
    public  static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        if((Math.round(firstNumber*3)/3) == (Math.round(secondNumber*3)/3)){
            return true;
        }else{
            return false;
        }

    }
}
