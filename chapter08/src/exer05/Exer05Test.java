package exer05;

public class Exer05Test {
    public static void main(String[] args) {
        Developer d1 = new Developer("李明",38);
        Bicycle b1 = new Bicycle();
        Car v1 = new Car();
        ElectricVehicle v2 = new ElectricVehicle();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = b1;
        vehicles[1] = v1;
        vehicles[2] = v2;

        for (int i = 0; i < vehicles.length; i++) {
            d1.takingVehicle(vehicles[i]);

            if (vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }


    }
}
