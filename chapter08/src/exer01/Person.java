package exer01;

public class Person {
    //单例设计模式，懒汉式

    //1.创建私有化构造器，防止外部创建实例对象
    private Person() {
    }

    //2.类的内部创建唯一的空的私有化对象实例
    private static Person person = null;

    //3.为外部获取唯一实例提供get()方法
    public static Person getPersonData() {

        //4.为空实例创建对象
        if (person == null){
            person = new Person();
        }

        return person;
    }
}
