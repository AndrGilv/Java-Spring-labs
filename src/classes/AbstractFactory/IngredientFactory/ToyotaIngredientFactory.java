package classes.AbstractFactory.IngredientFactory;

public class ToyotaIngredientFactory extends IngredientFactory {
    @Override
    public String assembleEngine() {
        return "Toyota engine";
    }

    @Override
    public String assembleTransmission() {
        return "Toyota transmission";
    }
}
