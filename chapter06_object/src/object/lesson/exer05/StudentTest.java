package object.lesson.exer05;

/**
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        //打印三年级的学生信息
        StudentUtil stu = new StudentUtil();
        stu.printStudentInfoWithState(students,3);

        System.out.println("****************需求分割线*****************");
        stu.pritStudentInfo(students);

        System.out.println("****************排序分割线*****************");
        //使用冒泡排序排列学生成绩
        stu.sortStudentScore(students);

        stu.pritStudentInfo(students);
    }
}
