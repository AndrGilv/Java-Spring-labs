package classes.AbstractFactory;

import classes.Car;

public abstract class AbstractFactory {


    protected abstract Car createCar(String carName);

    public Car orderCar(String carName){
        Car car = createCar(carName);
        car.assembleCar();
        System.out.println("Выбранный автомобиль: " + car.getInfoString());

        return car;
    }
}
