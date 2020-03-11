package classes;

public abstract class Decorator extends Car {


    protected Car car;

    public abstract String showInfo();
    public abstract int getCost();

    public Car getCar(){
        return  car;
    }


}
