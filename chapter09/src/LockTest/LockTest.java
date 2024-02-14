package LockTest;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {
    private int ticket = 100;
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {

            try {
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售卖的票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }

            } finally {
                lock.unlock();
            }
        }
    }
}

