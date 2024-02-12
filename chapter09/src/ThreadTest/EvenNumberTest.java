package ThreadTest;

public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberThread number = new EvenNumberThread();
        number.start();

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0 ){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
