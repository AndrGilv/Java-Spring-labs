package classes;

public abstract class Decorator extends Car {


    protected Car car;

    public abstract String getInfoString();
    public abstract int getCost();

    public Car getCar(){
        return  car;
    }
    @Override
    public void assembleCar() {}

}
