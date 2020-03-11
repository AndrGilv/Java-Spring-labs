package classes.Decorations;

import classes.Car;
import classes.Decorator;

public class LeatherInterior extends Decorator {
    Car car;
    public LeatherInterior(Car car){
        this.car = car;
    }

    public String showInfo(){
        return car.showInfo() + " + Кожаный салон";
    }

    public int getCost(){
        return 40_000 + car.getCost();
    }
}
