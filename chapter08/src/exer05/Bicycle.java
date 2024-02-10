package exer05;

public class Bicycle extends Vehicle{
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    public Bicycle() {
    }

    @Override
    public void run() {
        System.out.println("捷安特自行车，你值得拥有");
    }
}
