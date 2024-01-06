package lesson.exercise;

public class ArrayExercise6 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr);

        int[] arr2 = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        arr2[arr.length + 1] = 10;
        arr2[arr.length + 2] = 20;
        arr2[arr.length + 3] = 30;

        arr = arr2;
        System.out.println(arr);
        System.out.print("新数组内容是：");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

        System.out.println();
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr4 = new int[arr3.length - 1];

        int DELETEINDEX = 4;

        for (int i = 0; i < DELETEINDEX; i++) {
            arr4[i] = arr3[i];
        }

        for (int i = DELETEINDEX; i < arr3.length - 1; i++) {
            arr4[i] = arr3[i + 1];
        }
        arr3 = arr4;
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
