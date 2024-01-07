package object.lesson.exer01;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.id = "110802031006";
        emp1.age = 24;
        emp1.name = "Yan";
        emp1.salary = 10000;
        emp1.birthday = new Mydate();
        emp1.birthday.year = 1993;
        emp1.birthday.month = 10;
        emp1.birthday.day = 16;

        System.out.println("员工的信息是：" +
                "姓名：" + emp1.name +
                "年龄: " + emp1.age +
                "工号: " + emp1.id +
                "薪资: " + emp1.salary +
                "生日: " + emp1.birthday.year + "年" + emp1.birthday.month + "月" + emp1.birthday.day + "日");
    }
}
