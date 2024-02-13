package exer05;

public class SaleTicket implements Runnable{
    private int ticket = 100;
//    Object obj = new Object();
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){
            synchronized (this){//使用this最方便
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
}
