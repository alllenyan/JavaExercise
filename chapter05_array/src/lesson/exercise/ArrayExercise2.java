package lesson.exercise;

import java.util.Scanner;

/*
* 案例 3：从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
• 成绩>=最高分-10 等级为’A’
• 成绩>=最高分-20 等级为’B’
• 成绩>=最高分-30 等级为’C’
• 其余 等级为’D’
提示：先读入学生人数，根据人数创建 int 数组，存放学生成绩。*/

public class ArrayExercise2 {
    public static void main(String[] args) {

        System.out.print("请输入学生人数:");
        Scanner input = new Scanner(System.in);
        int numberOfStudent = input.nextInt();

        int[] scores = new int[numberOfStudent];
        int maxSocre = scores[0];

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩: ");
            scores[i] = input.nextInt();
            maxSocre = (maxSocre > scores[i]) ? maxSocre : scores[i];
        }

        System.out.println("学生中的最高分为:" + maxSocre);

        char grade;
        for (int i = 0; i < numberOfStudent; i++) {
            if(maxSocre - scores[i] <= 10){
                grade = 'A';
            } else if (maxSocre - scores[i] <= 20) {
                grade = 'B';
            } else if (maxSocre - scores[i] <= 30) {
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("第" + (i + 1) + "个学生的成绩为:" + scores[i] + " 等级为" + grade);
        }
    }
}
