package classes.AbstractFactory;

import classes.AbstractFactory.IngredientFactory.IngredientFactory;
import classes.AbstractFactory.IngredientFactory.ToyotaIngredientFactory;
import classes.Car;
import classes.PassengerCar;
import classes.SuperCar;
import classes.Truck;

public class ToyotaFactory extends AbstractFactory {

    @Override
    protected Car createCar(String carName) {
        Car car = null;
        IngredientFactory ingredientFactory = new ToyotaIngredientFactory();
        switch (carName){
            case "passenger car": car = new PassengerCar(ingredientFactory);
                break;
            case "truck": car = new Truck(ingredientFactory);
                break;
            case "supercar": car = new SuperCar(ingredientFactory);
                break;
            default: throw new IllegalArgumentException();
        }
        car.setName("Toyota " + car.getName());
        return car;
    }
}
