package exer05;

public class SaleTicket3 implements Runnable {
    private int ticket = 100;
    boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {
            sale();
        }
    }

    public synchronized void sale() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "售卖的票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
