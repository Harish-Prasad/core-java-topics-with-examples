
public class WhileStatement {

    public static void main(String[] args) {
        System.out.println("******** Counter using While Loop ********");
        int count = 1;
        while (count != 6){
            System.out.println("Count value is "+count);
            count++;
        }

        System.out.println();
        System.out.println("******** Counter using For Loop ********");

        for(int forCount = 1; forCount < 6; forCount++){
            System.out.println("count value using for-loop is "+forCount);
        }
        System.out.println();
        System.out.println("******** Counter using Do-While Loop ********");

        int whileCount = 1;
        do{
            System.out.println("count value using while-loop is "+whileCount );
            whileCount++;
        }while (whileCount != 6);

        boolean isEvenNumberResult = isEvenNumber(13);
        System.out.println(isEvenNumberResult);

    }
    public  static boolean isEvenNumber(int number){
        if(number % 2 == 0)
            return true;
        else
            return false;
    }

}
