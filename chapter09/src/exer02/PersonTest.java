package exer02;

import org.junit.Test;

public class PersonTest {
    public static void main(String[] args) {
//        Person p1 = new Person("小瘪三",-10);

        Person p2 = new Person();

        try{
            p2.setLifeValue(10);
            p2.setLifeValue(-5);
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }

    }
    
    @Test
    public void test1(){
        double area = Math.PI * 10;
        System.out.println(area);
    }
}
