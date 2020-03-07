package classes.Decorations;

import classes.Car;

public class SportSuspension extends Car{
    Car car;
    public SportSuspension(Car car){
        this.car = car;
    }

    public String showInfo(){
        return car.showInfo() + " + Спортивная подвеска";
    }

    public int getCost(){
        return 100_000 + car.getCost();
    }

    public Car getCar(){
        return car;
    }
}
