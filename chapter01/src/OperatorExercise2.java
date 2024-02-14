public class OperatorExercise2 {
    public static void main(String[] args) {
        /*
         * 拓展：获取一个四位数的个位，十位，百位，千位
         */
        int number2 = 1234;
        //千位
        int qian = number2 / 1000;
        //百位
        int bai =  number2 % 1000 / 100;
        //十位
        int shi = number2 % 1000 % 100 / 10;
        //个位
        int ge = number2 % 1000 % 100 % 10;

        System.out.println( "数字 " + number2 + " " +
                "的千位是: " + qian + " " +
                "百位是: " + bai + " " +
                "十位是: " + shi + " " +
                "个位是: " + ge);
    }
}
