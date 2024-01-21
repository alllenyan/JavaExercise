package exer04;

public class KIdTest {
    public static void main(String[] args) {
        Kids kid1 = new Kids();
        kid1.setSex(1);
        kid1.setSalary(2000);
        kid1.setYearsOld(28);

        kid1.printAge();
        kid1.manOrWoman();
        kid1.employeed();
    }
}
