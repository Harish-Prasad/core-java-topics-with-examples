public class SecondsAndMinutes {

    public static void main(String[] args) {

    String time =  getDuration(125,50);
        System.out.println(time);
        System.out.println(getDuration(603));
    }

    public  static  String  getDuration(int minutes, int seconds){

        if( (minutes >= 0) && (seconds >=0 && seconds <=59) ){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h "+remainingMinutes+"m "+seconds+" s";

        }else
            return "Invalid Value";

    }

    public  static String getDuration(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDuration(minutes, remainingSeconds);
    }
}
