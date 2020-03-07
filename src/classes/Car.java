package classes;

public abstract class Car extends Transport {

    protected String transmission;// задний, передний, полный привод

    public Car(){
        this.kind = "Car";
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
