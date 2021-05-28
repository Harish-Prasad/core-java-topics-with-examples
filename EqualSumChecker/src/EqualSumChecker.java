

public class EqualSumChecker {

    public static void main(String[] args) {

        boolean result =  hasEqualSum(1,-1,0);
        System.out.println(result);
    }
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        int sumOfTwoNumbers = firstNumber + secondNumber;
        if(sumOfTwoNumbers == thirdNumber)
            return true;
        else
            return false;
    }
}
