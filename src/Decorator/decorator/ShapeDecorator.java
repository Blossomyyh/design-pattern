package Decorator.decorator;

import Decorator.DShape;

public abstract class ShapeDecorator implements DShape {
    protected DShape decoratedShape;

    public ShapeDecorator(DShape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}