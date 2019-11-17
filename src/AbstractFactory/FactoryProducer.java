package AbstractFactory;


public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeAFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorAFactory();
        }
        return null;
    }
}
