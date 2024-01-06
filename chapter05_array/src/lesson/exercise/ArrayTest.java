package lesson.exercise;

public class ArrayTest {
    public static void main(String[] args) {
        //数组的初始化与声明
        double[] prices;//声明
        prices = new double[]{20.32,43.21,43.22,54.21,64.21};//初始化

        String[] foods = new String[4];

        //类型推断
        int[] arr = {1,23,4,5};

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices);

        foods[1] = "傻逼";
        System.out.println(foods[0]);
        System.out.println(foods[1]);

        System.out.println(foods.length);

        for (int i = 0;i < prices.length;i++){
            System.out.println(prices[i]);
        }

        //数组的初始化值
        int[] arr1 = new int[3];
        double[] arr2 = new double[3];
        char[] arr3 = new char[3];
        boolean[] arr4 = new boolean[3];
        String[] arr5 = new String[3];

        System.out.println(arr1[0]);//0
        System.out.println(arr2[0]);//0.0
        System.out.println(arr3[0]);//0 / '\u0000'
        System.out.println(arr4[0]);//fasle
        System.out.println(arr5[0]);//null
        
    }
}
