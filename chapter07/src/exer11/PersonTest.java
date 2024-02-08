package exer11;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        Man m1 = new Man();

        Person p2 = new Man();

        p2.eat();
        p2.walk();
        //由于java的多态性，p2对象可使用的方法仅包含左边引用类型的方法，无法使用右边对象类型的方法
//      p2.earnMoney();
        m1.earnMoney();

        //向下转型
        if(p2 instanceof Man){
            Man p3 = (Man)p2;
            p3.earnMoney();
            p3.setPhone(2000);
            System.out.println(p3.getPhone());
        }

    }
}
