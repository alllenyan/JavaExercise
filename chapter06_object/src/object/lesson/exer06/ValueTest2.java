package object.lesson.exer06;

public class ValueTest2 {
    public static void main(String[] args) {

        int m = 10;

        ValueTest2 test1 = new ValueTest2();
        test1.method1(m);

        System.out.println(m);//10

        Person p1 = new Person();
        p1.age = 10;

        test1.method2(p1);

        System.out.println(p1.age);//11

    }

    public void method1(int m) {
        m++;
    }

    public void method2(Person p) {
        p.age++;
    }
}

class Person {
    int age;
}
