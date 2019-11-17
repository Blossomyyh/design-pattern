package Decorator.decorator;

import Decorator.DShape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(DShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(DShape decoratedShape){
        System.out.println("Border Color: Red");
    }
}