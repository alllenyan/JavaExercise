package ThreadCommunication;

public class ThreadCommunication implements Runnable{
    private int number = 1;
    @Override
    public synchronized void run() {
        while (true){
            if (number <= 100){

                notify();

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + number);
                number++;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }else {
                break;
            }
        }
    }
}
