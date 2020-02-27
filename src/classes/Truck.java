package classes;

public class Truck extends Car {

    private int payLoad; // грузоподъемность
    private double volume; // полезный объем

    public Truck(String name, int numberOfSeats, String transmission, int payLoad, double volume) {
        super(name, "Грузовой транспорт", numberOfSeats, transmission);
        this.volume = volume;
        this.payLoad = payLoad;
    }

    public Truck() {
        super("Грузовой транспорт");
    }

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        if(payLoad > 0){
            this.payLoad = payLoad;
        }
        else
            throw new IllegalArgumentException();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > 0){
            this.volume = volume;
        }
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String showInfo() {
        String info = super.showInfo();
        info += ", pay load = " + payLoad + ", volume = " + volume;
        return info;
    }
}
