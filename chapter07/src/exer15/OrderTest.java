package exer15;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001,"Order1");
        Order o2 = new Order(1001,"Order1");

        System.out.println(o1.equals(o2));
    }
}
