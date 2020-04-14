import classes.SuperCar;

public class Main_Lab8_Builder {

    public static void main(String[] args) {
        SuperCar car = SuperCar.newBuilder()
                .setCost(2_000_00)
                .setEngine("v12")
                .setDoorsNum(2)
                .setLimitedEditionSize(2)
                .setName("First supercar")
                .build();
        System.out.println(car.getInfoString());

        car = SuperCar.newBuilder()
                .setFormFactor("Хетчбек")
                .setKind("Автомобиль")
                .setNumberOfSeats(2)
                .setSerialNum(1)
                .setSubtype("Спорт")
                .build();
        System.out.println(car.getInfoString());
    }


}
