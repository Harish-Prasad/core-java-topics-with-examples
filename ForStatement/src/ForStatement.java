
public class ForStatement {
    public static void main(String[] args) {

        for(int i = 2; i <= 8; i++){

            System.out.println("10,000 at "+ i +"% interest = " +calculateInterest(1000.0,i));
        }
        System.out.println();
        for(int i = 8; i >= 2; i--){

            System.out.println("10,000 at "+ i +"% interest = " +calculateInterest(1000.0,i));
        }

        boolean isPrimeResult = isPrime(2);
        System.out.println(isPrimeResult);
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.println(i+" is a prime number");
                count++;
                if(count == 20)
                    break;
            }
        }
    }

    public  static double calculateInterest(double amount, double interestRare){

        return (amount * (interestRare / 100));
    }

    public  static  boolean isPrime(int n){
        if(n == 1)
            return false;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
}

