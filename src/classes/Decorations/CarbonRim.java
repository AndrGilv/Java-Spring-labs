package classes.Decorations;

import classes.Car;

public class CarbonRim extends Car {
    Car car;
    public CarbonRim(Car car){
        this.car = car;
    }

    public String showInfo(){
        return car.showInfo() + " + Карбоновые диски";
    }

    public int getCost(){
        return 50_000 + car.getCost();
    }
}
