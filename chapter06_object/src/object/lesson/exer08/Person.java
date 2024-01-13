package object.lesson.exer08;

public class Person {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("你输入尼玛的年龄呢，尼玛死了");
        }
    }

    public int getAge() {
        return age;
    }

}
