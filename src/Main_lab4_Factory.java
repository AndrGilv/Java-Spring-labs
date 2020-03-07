import classes.Car;
import classes.Factory.CarFactory;
import classes.Factory.MercedesCarFactory;
import classes.Factory.ToyotaCarFactory;

public class Main_lab4_Factory {
    public static void main(String[] args) {
        CarFactory factory = new MercedesCarFactory();
        Car car = factory.orderCar("S");

        factory = new ToyotaCarFactory();

        car = factory.orderCar("mark2");
    }
}
