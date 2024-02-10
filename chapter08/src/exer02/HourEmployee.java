package exer02;

public class HourEmployee extends Employee{
    private double wage;
    private double hour;

    public HourEmployee() {
    }

    public HourEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double earings(){
        return wage * hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourEmployee{" + super.toString() + '}';
    }
}
