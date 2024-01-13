package object.lesson.exer07;

public class PassObject {

    public void printArea(Circle c, int time){

        System.out.println("radius\t\tArea");

        for (int i = 1; i <= time; i++) {
            c.radius = i;
            double area = c.findArea();
            System.out.println(c.radius + "\t\t " + area);
        }
    }
}
