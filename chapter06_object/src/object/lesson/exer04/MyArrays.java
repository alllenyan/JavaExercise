package object.lesson.exer04;

public class MyArrays {

    /**
     * 获取数组中的最大值
     * @param arr 传入数组类型的参数
     * @return 返回数组中的最小值
     */
    public int getMax(int[] arr){

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            temp = (temp > arr[i]) ? temp : arr[i];
        }
        return temp;
    }

    /**
     * 获取数组中的最小值
     * @param arr 传入数组类型的参数
     * @return 返回数组中的最小值
     */
    public int getMin(int[] arr){

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            temp = (temp > arr[i]) ? arr[i] : temp;
        }
        return temp;
    }

    /**
     * 获取数组中的平均值
     * @param arr 传入数组类型的参数
     * @return 返回数组中的所有元素总和的平均值
     */
    public int getAverage(int[] arr){

        int sum = getSum(arr);
        return  sum / arr.length;

    }

    /**
     * 获取数组中所有元素的总和
     * @param arr 传入数组类型的参数
     * @return 返回数组中所有元素的总和
     */
    public int getSum(int[] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 遍历数组，打印数组的内容
     * @param arr 传入数组类型的参数
     */
    public void printArray(int[] arr){
        System.out.print("数组的内容是: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print(arr[i]);
            }else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    /**
     * 复制一个数组
     * @param arr 传入数组类型的参数
     * @return 返回一个一模一样的数组
     */
    public int[] copyArray(int[] arr){

        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
