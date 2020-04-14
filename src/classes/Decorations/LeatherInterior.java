package classes.Decorations;

import classes.Car;
import classes.Decorator;

public class LeatherInterior extends Decorator {

    public LeatherInterior(Car car){
        this.car = car;
    }

    public String getInfoString(){
        return car.getInfoString() + " + Кожаный салон";
    }

    public int getCost(){
        return 40_000 + car.getCost();
    }
}
