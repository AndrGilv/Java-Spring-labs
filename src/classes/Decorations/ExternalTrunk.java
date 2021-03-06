package classes.Decorations;

import classes.Car;
import classes.Decorator;

public class ExternalTrunk extends Decorator {

    public ExternalTrunk(Car car){
        this.car = car;
    }

    public String getInfoString(){
        return car.getInfoString() + " + Внешний багажник";
    }

    public int getCost(){
        return 20_000 + car.getCost();
    }
}
