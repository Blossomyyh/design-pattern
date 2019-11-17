package Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //todo other way: https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/


        /**
         * 1. Request to produce a unique serial number.
         *
         2, the counter in the WEB,
         do not need to be added once in the database every time you refresh,
         use a single case to cache first.

         3. An object created needs to consume too many resources,
         such as I/O and database connections.
         */

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //todo 1. simple & unsafe in multi-thread
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
