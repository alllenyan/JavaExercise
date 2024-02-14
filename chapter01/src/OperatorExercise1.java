public class OperatorExercise1 {
    public static void main(String[] args) {
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
    }
}
