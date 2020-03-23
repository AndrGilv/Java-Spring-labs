package classes.Decorations;

import classes.Car;
import classes.Decorator;

public class SportSuspension extends Decorator {

    public SportSuspension(Car car){
        this.car = car;
    }

    public String showInfo(){
        return car.showInfo() + " + Спортивная подвеска";
    }



    public int getCost(){
        return 100_000 + car.getCost();
    }


}
