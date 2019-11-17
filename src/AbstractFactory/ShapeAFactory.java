package AbstractFactory;

import AbstractFactory.ColorFactory.Color;
import AbstractFactory.ShapeFactory.Octangle;
import AbstractFactory.ShapeFactory.Shape;
import AbstractFactory.ShapeFactory.Triangle;

public class ShapeAFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase(" Octangle")){
            return new Octangle();
        } else if(shapeType.equalsIgnoreCase("Triangle")){
            //This method returns true if the argument is not null
            // and it represents an equivalent String ignoring case, --- upper/lower all fine
            // else false.
            return new Triangle();
        }
        return null;
    }
}
