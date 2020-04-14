package classes.Decorations;

import classes.Car;
import classes.Decorator;

public class CarbonRim extends Decorator {

    public CarbonRim(Car car){
        this.car = car;
    }

    public String getInfoString(){
        return car.getInfoString() + " + Карбоновые диски";
    }

    public int getCost(){
        return 50_000 + car.getCost();
    }
}
