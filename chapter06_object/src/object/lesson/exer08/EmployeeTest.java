package object.lesson.exer08;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("---------添加第" + (i+1) + "个员工---------");
            System.out.print("姓名: ");
            employees[i].setName(input.next());
            System.out.print("性别: ");
            employees[i].setGender(input.next());
            System.out.print("年龄: ");
            employees[i].setAge(input.nextInt());
            System.out.print("电话: ");
            employees[i].setPhone(input.next());
        }

        System.out.println("--------------------员工列表--------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i+1) + "\t" + employees[i].getInfo());
        }
        System.out.println("------------------员工列表完成-------------------");

    }
}
