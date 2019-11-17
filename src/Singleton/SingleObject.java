package Singleton;

public class SingleObject {
    //创建 SingleObject 的一个对象
    //eager -- initialize object at the beginning
    private static SingleObject instance = new SingleObject();

    //todo 让构造函数为 private!，这样该类就不会被实例化
    private SingleObject(){}

    //get the only instance
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
