package exer02;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        Scanner input = new Scanner(System.in);

        employees[0] = new SalariedEmployee("Tom",1001,new MyDate(1993,10,16),15000);
        employees[1] = new HourEmployee("Jerry",1002,new MyDate(1994,11,17),80,40);

        System.out.println("请输入生日月份");
        int birthdayMonth = input.nextInt();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            System.out.println("工资是" + employees[i].earings());

            if (employees[i].getBirthday().getMonth() == birthdayMonth){
                System.out.println("名义上给你加100块钱");
            }
        }
    }
}
