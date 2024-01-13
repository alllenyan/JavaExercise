package object.lesson.exer06;

import object.lesson.Person;

public class ValueTest {
    public static void main(String[] args) {

        int m = 10;
        int n = m;

        System.out.println("m = " + m + ", n = " + n);// m = 10,n = 10

        m++;

        System.out.println("m = " + m + ", n = " + n);//m = 11,n = 10

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;

        arr1[0] = 2;

        System.out.println(arr2[0]);//2

        Order p1 = new Order();
        Order p2 = p1;

        p1.orderID = 10;

        System.out.println(p2.orderID);//10

    }
}
class Order{
    int orderID;
}
