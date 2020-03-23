package classes;

import classes.AbstractFactory.IngredientFactory.IngredientFactory;

public abstract class Car extends Transport {

    protected IngredientFactory ingredientFactory;
    protected String engine;
    protected String transmission;// задний, передний, полный привод

    public Car(){
        this.kind = "Car";
    }

    public Car(IngredientFactory ingredientFactory){
        this.kind = "Car";
        this.ingredientFactory = ingredientFactory;
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
        info += ", transmission = " + transmission + ", engine = " + engine;
        return info;

    }

    public abstract void assembleCar();

}
