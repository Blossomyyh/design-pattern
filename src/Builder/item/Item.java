package Builder.item;

import Builder.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}