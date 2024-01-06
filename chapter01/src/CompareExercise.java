public class CompareExercise {
    public static void main(String[] args) {
        /*
        * 案例 1：获取两个数中的较大值
        * */
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        int max = (number1 > number2)? number1 : number2;
        System.out.println("数字1是:" + number1);
        System.out.println("数字2是:" + number2);
        System.out.println("两个数字较大的是:" + max);

        /*
        * 案例 2：获取三个数中的最大值
        * */
        int number3 = 12;
        int number4 = 20;
        int number5 = 4;

        int tempMax = (number3 > number4)? number3 : number4;
        int max2 = (tempMax > number5)? tempMax : number5;
        System.out.println("三个数中最大的数是:" + max2);
    }
}
