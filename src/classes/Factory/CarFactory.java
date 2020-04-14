package classes.Factory;

import classes.Car;

public abstract class CarFactory {
    protected abstract Car createCar(String carName);

    public Car orderCar(String carName){
        Car car = createCar(carName);
        System.out.println("Выбранный автомобиль: " + car.getInfoString());

        return car;
    }
}
