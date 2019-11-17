package Decorator;

import Decorator.decorator.RedShapeDecorator;
import Decorator.decorator.ShapeDecorator;
import Decorator.shape.SemiCircle;
import Decorator.shape.Star;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        DShape circle = new SemiCircle();
        ShapeDecorator redCircle = new RedShapeDecorator(new SemiCircle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Star());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}