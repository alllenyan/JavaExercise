package exer04;

public class SaleTicketTest {
    public static void main(String[] args) {

        SaleTicket t = new SaleTicket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.setName("卖票口1");
        t2.setName("卖票口2");
        t3.setName("卖票口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
