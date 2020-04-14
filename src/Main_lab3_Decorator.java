import classes.*;
import classes.Decorations.CarbonRim;
import classes.Decorations.LeatherInterior;
import classes.Decorations.SportSuspension;

public class Main_lab3_Decorator {
    public static void main(String[] args) {

        Car car =  (Car)Transports.produceRandTransport();
        System.out.println(car.getInfoString());
        car = new CarbonRim(car);
        System.out.println(car.getInfoString());
        car = new LeatherInterior(car);
        System.out.println(car.getInfoString());

        car = new SportSuspension(car);
        System.out.println(car.getInfoString());
        car = ((Decorator)car).getCar();
        System.out.println(car.getInfoString());
        car = ((Decorator)car).getCar();
        System.out.println(car.getInfoString());
        car = ((Decorator)car).getCar();
        System.out.println(car.getInfoString());

    }




}
