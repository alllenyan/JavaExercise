package Thread01;

public class ThreadTest extends Thread{
    public ThreadTest() {
    }

    public ThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
