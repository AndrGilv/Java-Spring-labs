package classes.Factory;

import classes.Car;
import classes.PassengerCar;
import classes.SuperCar;
import classes.Truck;

public class MercedesCarFactory extends CarFactory {

    protected Car createCar(String carName) {
        Car car = null;
        switch(carName){
            case "S": car = new PassengerCar("Mercedes S560", 4, "Полный привод", "Седан", "Лонг", 4);
                break;
            case "GT": car = new SuperCar("Mercedes-AMG GT", "Полный привод", "Grand turismo", 4);
                break;
            case "Actros": car = new Truck("Мерседес Актрос", 1, "Задний привод", 33000, 0);
                break;
            default: throw new IllegalArgumentException();
        }

        return car;
    }
}
