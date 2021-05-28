
public class TeenNumberChecker {
    public static void main(String[] args) {
    boolean hasTeenResult = hasTeen(999,99,15);
        System.out.println(hasTeenResult);
    boolean isTeenResult = isTeen(16);
        System.out.println(isTeenResult);
    }

    public  static boolean hasTeen(int firstPerson, int secondPerson, int thirdPerson){
        if(firstPerson >= 13 && firstPerson <=19)
            return true;
        else if(secondPerson >= 13 && secondPerson <=19)
            return true;
        else if(thirdPerson >= 13 && thirdPerson <=19)
            return true;
        else
            return false;
    }

    public static  boolean isTeen(int personAge){
        if(personAge >= 13 && personAge <=19)
            return true;
        else
            return false;
    }
}
