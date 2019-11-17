package Builder.item;


public class Coke extends ColdDrink {
    /** interface -> (abstract/not) class : implement
    *** (abstract/not) class -> class : extends
     */

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}