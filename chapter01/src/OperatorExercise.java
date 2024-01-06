public class OperatorExercise {
    public static void main(String[] args) {
        int a = 10,b = 3;

        System.out.println(a + b);//13
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1

        System.out.println(a + (a++));//20
        System.out.println(a);//11

        System.out.println(a + (++a));//23
        System.out.println(a);//12

        /*
        * 随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
        格式如下：
        数字 xxx 的情况如下：
        个位数：
        十位数：
        百位数：
        例如：
        数字 153 的情况如下：
        个位数：3
        十位数：5
        百位数：1
        * */
        int number = 153;
        //个位
        int ge = number % 10;
        //十位
        int shi = number % 100 / 10;
        //百位
        int bai = number / 100;

        System.out.println("数字: " + number + " 的百位是:" + bai + "十位是:" + shi + "个位是：" + ge);

        /*
        * 拓展：获取一个四位数的个位，十位，百位，千位
        */
        int number2 = 1234;
        //千位
        int qian = number2 / 1000;
        //百位
        int bai2 =  number2 % 1000 / 100;
        //十位
        int shi2 = number2 % 1000 % 100 / 10;
        //个位
        int ge2 = number2 % 1000 % 100 % 10;

        System.out.println( "数字 " + number2 + " " +
                            "的千位是: " + qian + " " +
                            "百位是: " + bai2 + " " +
                            "十位是: " + shi2 + " " +
                            "个位是: " + ge2);
    }
}
