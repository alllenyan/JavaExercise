package object.lesson.exer05;

public class StudentUtil {

    /**
     * 打印指定年纪的学生信息
     */
    public void printStudentInfoWithState(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
                System.out.println(students[i].printInfo());
            }
        }
    }

    /**
     * 遍历打印学生的全部信息
     *
     * @param students
     */
    public void pritStudentInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].printInfo());
        }
    }

    /**
     * 冒泡排序打印学生成绩
     *
     * @param students
     */
    public void sortStudentScore(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                Student temp;
                if (students[j].score > students[j + 1].score) {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
