package object.lesson.exet09;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("yzh",18);
        System.out.println(s1.showInfo());

        Student s2= new Student("yzh",17,"high school");
        System.out.println(s2.showInfo());

    }
}
