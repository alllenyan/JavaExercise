package ThreadTest;

public class ImplementInterfaceThread {
    public static void main(String[] args) {

        ImplementInterfaceTest p = new ImplementInterfaceTest();
        Thread t1 = new Thread(p);
        t1.start();
    }
}
