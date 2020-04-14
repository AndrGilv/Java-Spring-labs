package classes;

import classes.AbstractFactory.IngredientFactory.IngredientFactory;

public class SuperCar extends PassengerCar {

    protected int limitedEditionSize = -1;
    protected int serialNum = -1;

    public SuperCar() {

    }

    public static Builder newBuilder() {
        return new SuperCar().new Builder();
    }

    public class Builder {

        private Builder() {}

        public Builder setLimitedEditionSize(int limitedEditionSize) {
            SuperCar.this.limitedEditionSize = limitedEditionSize;
            return this;
        }

        public Builder setSerialNum(int serialNum) {
            SuperCar.this.serialNum = serialNum;
            return this;
        }

        public Builder setCost(int cost) {
            SuperCar.this.cost = cost;
            return this;
        }

        public Builder setDoorsNum(int doorsNum) {
            SuperCar.this.doorsNum = doorsNum;
            return this;
        }

        public Builder setEngine(String engine) {
            SuperCar.this.engine = engine;
            return this;
        }

        public Builder setFormFactor(String formFactor) {
            SuperCar.this.formFactor = formFactor;
            return this;
        }

        public Builder setIngredientFactory(IngredientFactory ingredientFactory) {
            SuperCar.this.ingredientFactory = ingredientFactory;
            return this;
        }

        public Builder setKind(String kind) {
            SuperCar.this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            SuperCar.this.name = name;
            return this;
        }

        public Builder setNumberOfSeats(int numberOfSeats) {
            SuperCar.this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder setSubtype(String subtype) {
            SuperCar.this.subtype = subtype;
            return this;
        }

        public Builder setTransmission(String transmission) {
            SuperCar.this.transmission = transmission;
            return this;
        }

        public Builder setType(String type) {
            SuperCar.this.type = type;
            return this;
        }

        public SuperCar build() {
            return SuperCar.this;
        }

    }

    public SuperCar(String name, String transmission, String subtype, int doorsNum) {
        super(name, 2, transmission, "Родстер", subtype, doorsNum);
    }

    public SuperCar(IngredientFactory ingredientFactory){
        super(ingredientFactory);
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

    @Override
    public String getInfoString() {
        String info = super.getInfoString();
        info += ", edition size = " + limitedEditionSize + ", serial number = " + serialNum;
        return info;
    }


}
