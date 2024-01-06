package lesson.exercise;

public class ArrayExercise5 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.print("数组元素是: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (90 - 10 + 1)) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("最大值为:" + max);

        //求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (min > arr[i]) ? arr[i] : min;
        }
        System.out.println("最小值为:" + min);

        //求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为:" + sum);
        
        //求平均值
        System.out.println("平均值为:" + sum / arr.length);
    }
}
