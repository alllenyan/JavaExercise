package exer13;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
        test.method(new Graduate());
        test.method(new Person());

    }

    public void method(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Graduate){
            System.out.println("Graduate,Student,Person");
        }
        if(e instanceof Student){
            System.out.println("Student,Person");
        }
        if(e instanceof Person){
            System.out.println("Person");
        }
    }
}
