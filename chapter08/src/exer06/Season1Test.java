package exer06;

public class Season1Test {
    public static void main(String[] args) {
        System.out.println(Season1.SUMMER.getSeasonDesc());
        System.out.println(Season1.SUMMER.getSeasonName());

        System.out.println(Season1.AUTUMN.toString());

        System.out.println(Season1.AUTUMN.getClass());
        System.out.println(Season1.AUTUMN.getClass().getSuperclass());
        System.out.println(Season1.AUTUMN.getClass().getSuperclass().getSuperclass());


        //Enum类中常用的方法
        //1. values()方法，返回的是一个数组
        System.out.println(Season1.values());
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].toString());
        }

        //2. valuesOf(objName)方法，根据传入的objName，从enum类中找到相应的对象实例，如传入的值不存在，则报错
        System.out.println(Season1.valueOf("SUMMER"));

        //3. toString()方法，返回的是对象的名称
        System.out.println(Season1.AUTUMN.toString());

        //4. name()方法，效果与未重写的toString()相同
        System.out.println(Season1.SUMMER.name());

        //5. ordinal()方法，返回枚举值声明的顺序，从0开始
        System.out.println(Season1.SPRING.ordinal());

        Season1.SPRING.seasonCharacter();

    }
}
