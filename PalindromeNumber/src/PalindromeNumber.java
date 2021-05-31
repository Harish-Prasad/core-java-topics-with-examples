
public class PalindromeNumber {
    public static void main(String[] args) {

        int number = 121;
        if(isPalindrome(number))
            System.out.println(number+" is a Palindrome Number");
        else
            System.out.println(number+" is not a Palindrome Number");

    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverse += lastDigit;
            reverse *= 10;
            number /= number;
            System.out.println(reverse);
        }

        if(number == reverse)
            return true;
        else
            return false;

    }
}
