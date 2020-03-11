import classes.*;
import classes.Decorations.CarbonRim;
import classes.Decorations.LeatherInterior;
import classes.Decorations.SportSuspension;

import java.util.Random;

public class Main_lab3_Decorator {
    public static void main(String[] args) {

        Car car =  (Car)Transports.produceRandTransport();
        System.out.println(car.showInfo());
        car = new CarbonRim(car);
        System.out.println(car.showInfo());
        car = new LeatherInterior(car);
        System.out.println(car.showInfo());

        car = new SportSuspension(car);
        System.out.println(car.showInfo());
        car = ((Decorator)car).getCar();
        System.out.println(car.showInfo());
        car = ((Decorator)car).getCar();
        System.out.println(car.showInfo());
    }




}
