package classes.Factory;

import classes.Car;
import classes.PassengerCar;

public class ToyotaCarFactory extends CarFactory{

    protected Car createCar(String carName) {
        Car car = null;
        switch(carName){
            case "rav4": car = new PassengerCar("Toyota Rav 4", 5, "Полный привод", "Внедорожник", "Сток", 4);
                break;
            case "mark2": car = new PassengerCar("Toyota Mark 2", 5, "Задний привод", "Седан", "Сток", 4);
                break;
            default: throw new IllegalArgumentException();
        }

        return car;
    }
}
