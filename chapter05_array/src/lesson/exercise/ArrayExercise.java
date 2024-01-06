package lesson.exercise;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = {8, 2, 1, 0, 3};
        int[] index = {2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        String tel = "";

        for (int i = 0; i < index.length; i++) {
            int value = index[i];
            tel += arr[value];
        }

        System.out.println(tel);

        /*
        * 案例 2：输出英文星期几
        用一个数组，保存星期一到星期天的 7 个英语单词，从键盘输入 1-7，显示对
        应的单词
        {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}*/

        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("今天是: " + week[number-1]);

        input.close();


    }
}
