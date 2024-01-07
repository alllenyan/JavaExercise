package object.lesson.exer02;

public class MethodTest {
    public static void main(String[] args) {

        Method m1 = new Method();
//        m1.Method1();
        int area = m1.Method2();
        System.out.println(area);

        int area2 = m1.Method3(6,5);
        System.out.println(area2);
    }
}
