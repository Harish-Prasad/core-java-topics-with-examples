public class Swift extends Car{

    private int roadServiceMonths;

    public Swift(int roadServiceMonths) {
        super("Swift", "4WD", 5, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            setCurrentGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            setCurrentGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            setCurrentGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        }else{
            setCurrentGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
