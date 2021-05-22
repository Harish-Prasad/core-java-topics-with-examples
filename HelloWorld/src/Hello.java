public class Hello {

    public static void main(String[] args){
    System.out.println("Hello, World");
//    print your name hard coded
    System.out.println("Hello, Harish Prasad!");
// variables: it is a name given to memory location in order to store any types of values
// such that it can be retrieved in future which promotes code reusability.

        int nameForStoringNumber = 10;
//        Here the value 10 is stored in the variable name "nameForStoringNumber" of type Interger
        System.out.println(nameForStoringNumber);
//        print that variable to the console

        int myMathematics = (2*3)+(5+2);
//        Expressions : it is a valid combination of operator(symbols) and operands(variables)
        System.out.println(myMathematics);


        int firstNumber = 100;
        int seocndNumber = 200;
        int thirdNumber = 300;
        int result = firstNumber + seocndNumber + thirdNumber;
        System.out.println("The result of the expression is "+ result);

        int forthNumber = (myMathematics*2)+(firstNumber*result);
        System.out.println("The expression output with variables and literals(constants) is "+forthNumber);
    }
}
