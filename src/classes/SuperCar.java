package classes;

public class SuperCar extends PassengerCar {

    private int limitedEditionSize;
    private int serialNum;

    public SuperCar(String name, String transmission, String subtype, int doorsNum) {
        super(name, 2, transmission, "Родстер", subtype, doorsNum);
    }

    public int getLimitedEditionSize() {
        return limitedEditionSize;
    }

    public void setLimitedEditionSize(int limitedEditionSize) {
        if (limitedEditionSize > 0){
            this.limitedEditionSize = limitedEditionSize;
        }
        else
            throw new IllegalArgumentException();
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        if (serialNum > 0 && serialNum <= limitedEditionSize){
            this.serialNum = serialNum;
        }
        else
            throw new IllegalArgumentException();
    }


}
