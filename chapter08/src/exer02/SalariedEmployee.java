package exer02;

public class SalariedEmployee extends Employee{
    private double monthSalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthSalary) {
        super(name, number, birthday);
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee() {
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public double earings(){
        return monthSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() + '}';
    }
}
