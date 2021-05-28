
public class MethodOverloading {

// Method overloading is a feature of Java in which a class has more than one method of the same name and their parameters are different
// differences might be in number of parameters or data types

    public static void main(String[] args) {

            int newScore = calculateScore("Harish",500);
            System.out.println("New score is "+newScore);
            calculateScore(90);
            calculateScore("Prasad");
            calculateScore();

//      Example for Converting physical units from one form to another using Method Overloading

            double centimeters = calcFeetAndInchesToCentimeters(6,0);
            if (centimeters < 0.0){
                System.out.println("Invalid Parameters");
            }
            calcFeetAndInchesToCentimeters(100);
    }


    public  static  int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }

    public  static  int calculateScore(int score){
        System.out.println("Unnamed Player scored "+score+" points");
        return score*1000;
    }

    public  static  int calculateScore(String playerName){
        System.out.println("Player "+playerName+" scored no points");
        return 0;
    }

    public  static  int calculateScore(){
        System.out.println("Unnamed Player NO score ");
        return 0;
    }

// Converting physical units Methods

    public  static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet >= 0) && (inches >=0 && inches <= 12)){
            double centimeter = (feet * 12) * 2.54;
            centimeter += inches * 2.54;
            System.out.println(feet+" feet, "+ inches +" inches = "+ centimeter +" cm");
        return centimeter;

        }else
            return -1;

    }

    public  static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches+" inches is equal to "+feet+" feet and "+ remainingInches +" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }else
            return -1;

    }

}
