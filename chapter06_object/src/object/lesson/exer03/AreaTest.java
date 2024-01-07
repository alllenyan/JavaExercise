package object.lesson.exer03;

public class AreaTest {
    public static void main(String[] args) {

        CircleArea circle = new CircleArea();

        circle.radious = 10;
        double area = circle.area();
        System.out.println(area);
    }
}
