package Decorator.shape;

import Decorator.DShape;

public class Star implements DShape {

    @Override
    public void draw() {
        System.out.println("Shape: Star");
    }
}