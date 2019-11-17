package AbstractFactory;

import AbstractFactory.ColorFactory.Color;
import AbstractFactory.ShapeFactory.Shape;

public abstract class AbstractFactory {
    /**
     * todo super factory to controll other factory
     */
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;

}
