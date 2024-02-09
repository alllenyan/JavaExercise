package exer01;

public class Bank {
    //单例设计模式，饿汉式

    //1.创建私有化构造器，防止外部创建实例对象
    private Bank() {
    }

    //2.类的内部创建唯一的私有化对象实例
    //4.将创建的实例对象声明为静态对象
    private static Bank bankData = new Bank();

    //3.为外部获取唯一实例提供get()方法
    public static Bank getBankData() {
        return bankData;
    }
}
