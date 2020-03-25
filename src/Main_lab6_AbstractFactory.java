import classes.AbstractFactory.AbstractFactory;
import classes.AbstractFactory.MercedesFactory;
import classes.AbstractFactory.ToyotaFactory;
import classes.Car;
import classes.Factory.CarFactory;
import classes.Factory.MercedesCarFactory;
import classes.Factory.ToyotaCarFactory;

public class Main_lab6_AbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ToyotaFactory();
        Car car = abstractFactory.orderCar("supercar");
        car = abstractFactory.orderCar("truck");
        abstractFactory = new MercedesFactory();
        car = abstractFactory.orderCar("supercar");
        car = abstractFactory.orderCar("truck");
    }
}
