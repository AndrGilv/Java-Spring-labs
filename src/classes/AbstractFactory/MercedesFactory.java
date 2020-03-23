package classes.AbstractFactory;

import classes.AbstractFactory.AbstractFactory;
import classes.AbstractFactory.IngredientFactory.IngredientFactory;
import classes.AbstractFactory.IngredientFactory.MercedesIngredientFactory;
import classes.Car;
import classes.PassengerCar;
import classes.SuperCar;
import classes.Truck;

public class MercedesFactory extends AbstractFactory {

    @Override
    protected Car createCar(String carName) {
        Car car = null;
        IngredientFactory ingredientFactory = new MercedesIngredientFactory();
        switch (carName){
            case "passenger car": car = new PassengerCar(ingredientFactory);
                break;
            case "truck": car = new Truck(ingredientFactory);
                break;
            case "supercar": car = new SuperCar(ingredientFactory);
                break;
            default: throw new IllegalArgumentException();
        }
        car.setName("Mercedess " + car.getName());
        return car;
    }
}
