package classes;

public class Car extends Transport {

    private String transmission;// задний, передний, полный привод

    public Car(String name, String type, int numberOfSeats, String transmission) {
        super("Автомобиль", name, type, numberOfSeats);
        this.transmission = transmission;
    }

    public Car(String type) {
        super("Автомобиль", type);

    }

    public String getTransmission() {

        return transmission;
    }

    public void setTransmission(String transmission) {

        this.transmission = transmission;
    }

    @Override
    public String showInfo() {
        String info = super.showInfo();
        info += ", transmission = " + transmission;
        return info;

    }
}
