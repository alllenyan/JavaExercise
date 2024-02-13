package exer05;

public class SaleTicketTest2 {
    public static void main(String[] args) {

        SaleTicket2 t = new SaleTicket2();
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
