package classes;

import classes.AbstractFactory.IngredientFactory.IngredientFactory;

public class PassengerCar extends Car {

    private String formFactor; // седан, купе ...
    private String subtype; // спорт, лонг ...
    private int doorsNum;

    public PassengerCar(IngredientFactory ingredientFactory){
        super(ingredientFactory);
    }

    public PassengerCar(String name, int numberOfSeats, String transmission, String formFactor, String subtype, int doorsNum) {
        this.name = name;
        this.type = "Пасажирский транспорт";
        this.numberOfSeats = numberOfSeats;
        this.transmission = transmission;
        this.formFactor = formFactor;
        this.subtype = subtype;
        this.doorsNum = doorsNum;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getSubtype() {
        return subtype;
    }

    public int getDoorsNum() {
        return doorsNum;
    }

    public void setDoorsNum(int doorsNum) {
        this.doorsNum = doorsNum;
    }

    @Override
    public String showInfo() {
        String info = super.showInfo();
        info += ", form factor = " + formFactor + ", subtype = " + subtype + ", number of doors = " + doorsNum;
        return info;
    }

    @Override
    public void assembleCar() {
        name = "passenger car";
        type = "Пасажирский транспорт";
        numberOfSeats = 4;
        transmission = ingredientFactory.assembleTransmission();
        engine = ingredientFactory.assembleEngine();
        formFactor = "Седан";
        subtype = "сток";
        doorsNum = 4;
    }
}
