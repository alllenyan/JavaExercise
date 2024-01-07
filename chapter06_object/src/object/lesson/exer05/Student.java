package object.lesson.exer05;

/**
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class Student {
    int number;
    int state;
    int score;

    public String printInfo(){
        return "学生的信息的学号是: " + number +
                ", 年级是: " + state +
                ", 成绩是： " + score;
    }
}
