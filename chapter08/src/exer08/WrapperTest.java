package exer08;

public class WrapperTest {
    public static void main(String[] args) {

        //基本数据类型 --> 包装类
        //使用包装类的valueOf()将基本数据类型转换为对应的包装类
        int number = 10;
        Integer numberInteger = Integer.valueOf(number);
        System.out.println("numberInteger是：" + numberInteger);

        //包装类 --> 基本数据类型
        //使用包装类的xxxValue()方法将包装类的值转换为对应的基本数据类型
        Float floatFloat = Float.valueOf(12.6F);
        float float1 = floatFloat.floatValue();
        System.out.println("floatFloat是：" + float1);

        //JDK 5.0之后提供了自动封装和自动拆箱功能
        //自动装箱：自动将基本数据类型转变为对应的包装类
        Integer number2 = number;
        System.out.println("自动装箱后的Integer是：" + number2);

        //自动拆箱：自动将包装类转换为对应的基本数据类型
        int number3 = Integer.valueOf(33);
        System.out.println("自动拆箱后的Float是：" + number3);

        //String转换为基本数据类型，通过parseXxx()方法将String类型的数据转换为基本数据类型
        String str1 = "123";
        int number4 = Integer.parseInt(str1);
        System.out.println("转换String类型之后：" + number4);

        //基本数据类型转换为String
        //1、通过基本数据类型和空字符串拼接进行转换
        //2、通过String类型的valueOf()方法进行转换
        Integer number5 = Integer.valueOf(50);
        String str2 = String.valueOf(number5);
        String str3 = number5 + "";
        System.out.println("String类型转换之后：" + str2);
        System.out.println("String类型转换之后" + str3);

    }
}
