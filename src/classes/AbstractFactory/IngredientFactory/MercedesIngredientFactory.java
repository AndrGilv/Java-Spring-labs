package classes.AbstractFactory.IngredientFactory;

public class MercedesIngredientFactory extends IngredientFactory {
    @Override
    public String assembleEngine() {
        return "Mercedes engine";
    }

    @Override
    public String assembleTransmission() {
        return "Mercedes transmission";
    }
}
