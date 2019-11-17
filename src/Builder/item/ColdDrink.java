package Builder.item;

import Builder.pack.Bottle;
import Builder.item.Item;
import Builder.pack.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}