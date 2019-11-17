package AbstractFactory.ColorFactory;
//todo Package = directory

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}