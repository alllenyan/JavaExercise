package lesson.exercise;

public class ArrayExercise3 {
    public static void main(String[] args) {

        //二维数组静态声明
        int[][] arr1;
        arr1 = new int[][]{{1,2,3},{4,5},{7,8,9}};

        double[][] arr2 = new double[][]{{1.0,2.0,3.0},{55.0,66}};

        String[][] arr3 = {{"1","a"},{"2","B"},{"1","2"},{"2","3"}};

        //二维数组动态声明
        int[][] arr4 = new int[3][4];

        boolean[][] arr5;
        arr5 = new boolean[2][1];

        String[][] arr6 = new String[3][];

        //二维数组的长度
        System.out.println(arr1.length);
        System.out.println(arr4.length);
        System.out.println(arr2[1].length);

        //二维数组初始化
        arr4[0][1] = 5;
        System.out.println(arr4[0][1]);
        System.out.println(arr4[0][0]);

        //二维数组的遍历
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        //二维数组的初始化值
        System.out.println(arr5[0]);
        System.out.println(arr5[0][0]);

        System.out.println(arr6[0]);
        System.out.println(arr6[0][0]);
    }
}
