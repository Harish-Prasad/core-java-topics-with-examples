
public class SumOdd {
    public static void main(String[] args) {

    boolean isOddResult = isOdd(22);
        System.out.println(isOddResult);

        int sumOddResult = sumOdd(1,100);
        System.out.println("Sum of odd numbers between start and end is "+sumOddResult);

    }
    public  static boolean isOdd(int number){
        if(number < 0){
            return false;
        }else {
            if( number % 2 == 0)
                return false;
            else
                return true;
        }
    }

    public  static  int  sumOdd(int start, int end){
        int sumOdd = 0;
        if((end >= start) && (start > 0 && end > 0)){
            for(int i = start; i < end+1; i++){
                if(isOdd(i)){
                    sumOdd += i;
                }
            }
            return sumOdd;
        }else
            return -1;

    }
}
