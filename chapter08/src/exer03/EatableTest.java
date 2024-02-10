package exer03;

public class EatableTest {
    public static void main(String[] args) {
        Eatable[] people = new Eatable[3];

        people[0] = new Chinese();
        people[1] = new American();
        people[2] = new Indian();

        for (int i = 0; i < people.length; i++) {
            people[i].eat();
        }

    }
}
