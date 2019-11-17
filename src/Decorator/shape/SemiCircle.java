package Decorator.shape;

import Decorator.DShape;

public class SemiCircle implements DShape {

    @Override
    public void draw() {
        System.out.println("Shape: SemiCircle");
    }
}
