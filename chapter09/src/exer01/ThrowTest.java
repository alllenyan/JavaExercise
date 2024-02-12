package exer01;

public class ThrowTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        try{
            stu1.setID(-4);
        }catch (RuntimeException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
