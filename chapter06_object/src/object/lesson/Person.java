package object.lesson;

public class Person {

    //局部变量
    String name;
    int age;
    char gender;


    public void speak() {
        String statament = "wohuishuonima"; //局部变量
        System.out.println("我会说话" + statament);
    }

    public void fuck() {
        System.out.println("我还会骂人");
    }

    public void sleep(int hours) {//形参，属于局部变量
        System.out.println("我可以睡" + hours + "个小时");
    }
}
