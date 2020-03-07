package classes.Decorations;

import classes.Car;

public class ExternalTrunk extends Car{
    Car car;
    public ExternalTrunk(Car car){
        this.car = car;
    }

    public String showInfo(){
        return car.showInfo() + " + Внешний багажник";
    }

    public int getCost(){
        return 20_000 + car.getCost();
    }
}
