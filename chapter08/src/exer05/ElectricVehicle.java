package exer05;

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动汽车那是非常nice的");
    }


    @Override
    public void power() {
        System.out.println("电动车的动力来源与轮胎");
    }
}
