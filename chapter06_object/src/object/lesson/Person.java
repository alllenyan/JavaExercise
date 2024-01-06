package object.lesson;

public class Person {

    String name;
    int age;
    char gender;


    public void speak() {
        System.out.println("我会说话");
    }

    public void fuck() {
        System.out.println("我还会骂人");
    }

    public void sleep(int hours) {
        System.out.println("我可以睡" + hours + "个小时");
    }
}
