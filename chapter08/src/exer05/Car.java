package exer05;

public class Car extends Vehicle implements IPower{
    private  String carNumber;

    public Car() {
    }

    @Override
    public void run() {
        System.out.println("雅迪电动车也是可以的");
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }


    @Override
    public void power() {
        System.out.println("电动车的动力来源与电力");
    }
}
