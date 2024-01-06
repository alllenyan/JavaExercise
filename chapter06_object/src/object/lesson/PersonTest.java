package object.lesson;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.age = 18;
        person1.gender = '男';
        person1.name = "Big Guy";

        System.out.println("人员的信息是:" +
                "姓名是:" + person1.name +
                "年龄是:" + person1.age +
                "性别是:" + person1.gender);

        System.out.println("对象实例的值是:" + person1);

        person1.sleep(7);
        person1.speak();
        person1.fuck();

    }
}
