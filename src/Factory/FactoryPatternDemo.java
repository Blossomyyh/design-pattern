package Factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        /**
         * Another example: In travel site, we can book train ticket as well bus tickets and flight ticket.
         * In this case user can give his travel type as ‘bus’, ‘train’ or ‘flight’.
         *
         * Or:
         * vehicle : 1/2/3 wheels
         *
         * 1. Logger: The record may be recorded to the local hard disk, system events, remote server, etc.,
         * and the user can choose where to log the log.
         *
         * 2, database access, when the user does not know which type of database the system uses,
         * and the database may change.
         *
         * 3, design a framework to connect to the server,
         * you need three protocols, "POP3", "IMAP", "HTTP",
         * you can use these three as a product class to achieve an interface.
         */
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Octangle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Octangle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
