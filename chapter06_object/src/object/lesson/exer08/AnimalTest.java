package object.lesson.exer08;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.setLegs(-4);
        animal1.type = "Tiger";

        System.out.println(animal1.getLegs());
        System.out.println(animal1.type);
    }
}

class Animal {

    String type;
    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int leg) {
        if (leg >= 0 && leg % 2 == 0) {
            legs = leg;
        } else {
            System.out.println("你赋值尼玛呢！");
        }
    }

    public void eat() {
        System.out.println("好吃，天天有！");
    }
}
