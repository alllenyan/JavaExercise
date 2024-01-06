package lesson.exercise;

public class ArrayExercise4 {
    public static void main(String[] args) {

        int[] arr = {1,55,6,78,43,6};

        int sum = 0;
        double average = 0;
        int resulut = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            resulut *= arr[i];
        }
        average = sum / arr.length;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(resulut);

    }
}
