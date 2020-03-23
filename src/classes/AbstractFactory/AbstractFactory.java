package classes.AbstractFactory;

import classes.AbstractFactory.IngredientFactory.IngredientFactory;
import classes.Car;

public abstract class AbstractFactory {


    protected abstract Car createCar(String carName);

    public Car orderCar(String carName){
        Car car = createCar(carName);
        car.assembleCar();
        System.out.println("Выбранный автомобиль: " + car.showInfo());

        return car;
    }
}
