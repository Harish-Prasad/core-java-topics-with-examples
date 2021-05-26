
public class BarkingDog {
    public static void main(String[] args) {

        boolean isWakedUp = shouldWakeUp(false,8);
        System.out.println(isWakedUp);
    }
    public  static  boolean shouldWakeUp(boolean barking,int hourOfDay){

        if((hourOfDay < 8 || hourOfDay > 22) && barking){
            if(hourOfDay < 0 || hourOfDay > 23){
                return false;
            }
            return true;
        }else{
            return false;
        }

    }
}
