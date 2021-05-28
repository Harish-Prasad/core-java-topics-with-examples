

public class MinutesToYearsAndDays {

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public  static  void printYearsAndDays(long minutes){
        if(minutes < 0)
            System.out.println("Invalid Value");
        else{

            long hours = minutes / 60L;
            long days = hours / 24L;
            long remainingDays = hours % 24L;
            long years = (days+remainingDays) / 365L;
            long remainingYears = (days+remainingDays) % 365L;
            System.out.println(minutes+" min = "+years+" y and "+remainingYears+" d");
        }


    }
}
