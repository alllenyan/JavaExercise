package ThreadTest;

public class EvenNumberThread extends Thread{
    public void run(){
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0 ){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
