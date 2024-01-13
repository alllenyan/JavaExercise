package object.lesson.exer06;

public class ValueTest3 {
    public static void main(String[] args) {

        ValueTest3 test = new ValueTest3();

        int m = 10;
        int n = 20;

        test.swap(m,n);

        System.out.println(m);
        System.out.println(n);


    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
