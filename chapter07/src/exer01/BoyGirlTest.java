package exer01;

public class BoyGirlTest {

    public static void main(String[] args) {
        Boy boy1 = new Boy();
        Girl girl1 = new Girl(18);
        Girl girl2 = new Girl(20);

        boy1.setAge(24);
        boy1.setName("Jack");
        girl1.setName("Rose");
        girl2.setName("Jenny");

        girl1.marry(boy1);
        girl1.compare(girl2);

    }
}
