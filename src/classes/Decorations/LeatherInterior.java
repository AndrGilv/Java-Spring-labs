package classes.Decorations;

import classes.Car;

public class LeatherInterior extends Car {
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
