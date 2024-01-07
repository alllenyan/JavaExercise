package object.lesson.exer04;

public class MyArrayTest {
    public static void main(String[] args) {

        MyArrays arr1 = new MyArrays();
        int[] arr2 = new int[]{12,34,54,24,34,76,87};

        System.out.println(arr1.getSum(arr2));
        System.out.println(arr1.getMax(arr2));
        System.out.println(arr1.getAverage(arr2));
        System.out.println(arr1.getMin(arr2));
        arr1.printArray(arr2);

        int[] arr3;
        arr3 = arr1.copyArray(arr2);
        arr1.printArray(arr3);

    }
}
