package exer17;

public class ExerTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.color);
        System.out.println(c1.weight);
        System.out.println(c1.getRadius());

        Circle c2 = new Circle();
        Circle c3 = new Circle();

        System.out.println(c2.equals(c3));
        System.out.println(c2.toString());

    }
}
