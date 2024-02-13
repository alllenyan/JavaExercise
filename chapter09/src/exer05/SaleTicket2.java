package exer05;

public class SaleTicket2 extends Thread{
    private int ticket = 100;
    static Object obj = new Object();
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){
//            synchronized (obj){//使用this最方便
            synchronized (SaleTicket2.class) {//最优写法
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
