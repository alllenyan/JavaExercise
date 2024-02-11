package exer08;

public class WrapperTest {
    public static void main(String[] args) {
        int num = 10;
        Integer num1 = Integer.valueOf(num);
        System.out.println(num1);

        //自动拆箱
        float f1 = Float.valueOf(10.3f);
        System.out.println(f1);

        //自动装箱
        Integer num2 = num;
        System.out.println(num2);

        //String转换为基本数据类型
        String str1 = "123";
        int num3 = Integer.parseInt(str1);
        System.out.println(num3);

        //基本数据类型转换为String
        Integer num4 = Integer.valueOf(50);
        String str2 = num4.toString();
        String str3 = num4 + "";
        System.out.println(str2);
        System.out.println(str3);

    }
}
