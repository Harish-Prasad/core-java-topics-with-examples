
public class DigitSum {

    public static void main(String[] args) {

        for (int i = 15; i < 88; i++ )
        {
            int sumDigitsResult = sumDigits(i);
            System.out.println("The sum of digits in a number "+i+" is "+sumDigitsResult);
        }

    }

    public  static  int sumDigits(int number){

        int sum = 0;
        if(number >= 10){

            while(number > 0){

                int digit = number % 10;
                sum += digit;
                number /= 10;

            }
           return sum;
        }else
            return -1;
    }
}

