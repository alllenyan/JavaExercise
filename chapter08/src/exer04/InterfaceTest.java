package exer04;

public class InterfaceTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(2.5);
        ComparableCircle c2 = new ComparableCircle(2.0);

        c1.setRadius(3.0);
        c2.setRadius(5.0);
        System.out.println(c1.compareTo(c2));

    }
}
