package ThreadCommunication;

public class ThreadCommunicationTest {
    public static void main(String[] args) {

        ThreadCommunication n1 = new ThreadCommunication();

        Thread t1 = new Thread(n1,"Thread 1");
        Thread t2 = new Thread(n1,"Thread 2");

        t1.start();
        t2.start();

    }
}
