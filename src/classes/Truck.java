package classes;

public class Truck extends Car {

    private int payLoad; // грузоподъемность
    private int volume; // полезный объем

    public Truck(String name, int numberOfSeats, String transmission) {
        super(name, "Грузовой транспорт", numberOfSeats, transmission);
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > 0){
            this.volume = volume;
        }
        else
            throw new IllegalArgumentException();
    }


}
