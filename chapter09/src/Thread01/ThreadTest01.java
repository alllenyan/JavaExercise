package Thread01;

public class ThreadTest01 {
    public static void main(String[] args) {

        Thread.currentThread().setName("主线程");

        ThreadTest t1 = new ThreadTest("线程1");
        t1.start();

        System.out.println(Thread.currentThread());

    }
}
