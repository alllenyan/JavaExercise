package exer04;

public class SaleTicket implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName() + "售卖的票号为：" + ticket);
                ticket--;
            }
            else {
                break;
            }
        }
    }
}
